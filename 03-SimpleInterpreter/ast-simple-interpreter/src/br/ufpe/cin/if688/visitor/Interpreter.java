package br.ufpe.cin.if688.visitor;

import br.ufpe.cin.if688.ast.AssignStm;
import br.ufpe.cin.if688.ast.CompoundStm;
import br.ufpe.cin.if688.ast.EseqExp;
import br.ufpe.cin.if688.ast.Exp;
import br.ufpe.cin.if688.ast.ExpList;
import br.ufpe.cin.if688.ast.IdExp;
import br.ufpe.cin.if688.ast.LastExpList;
import br.ufpe.cin.if688.ast.NumExp;
import br.ufpe.cin.if688.ast.OpExp;
import br.ufpe.cin.if688.ast.PairExpList;
import br.ufpe.cin.if688.ast.PrintStm;
import br.ufpe.cin.if688.ast.Stm;
import br.ufpe.cin.if688.symboltable.Table;

public class Interpreter implements IVisitor<Table> {
	
	//a=8;b=80;a=7;
	// a->7 ==> b->80 ==> a->8 ==> NIL
	private Table t;
	
	public Interpreter(Table t) {
		this.t = t;
	}

	@Override
	public Table visit(Stm s) {
		Table t = s.accept(this);
		return this.t;
	}

	@Override
	public Table visit(AssignStm s) {
		Table t1 = s.getExp().accept(this);
		// O tail de t vai ser t1 ou t1.tail ou null?
		Table t = new Table(s.getId(), t1.value, null);
		Table oldTable = this.t;
//		System.out.println("Print do AssignStm");
//		System.out.println(t);
		this.t = new Table(s.getId(), t1.value, oldTable);
		return t;
	}

	@Override
	public Table visit(CompoundStm s) {
		Table t1 = s.getStm1().accept(this);
		Table t2 = s.getStm2().accept(this);
		return null;
	}

	@Override
	public Table visit(PrintStm s) {
		Table t = s.getExps().accept(this);
		Table t1 = new Table(t.id, t.value, t.tail);
		while(t1 != null) {
			System.out.print(t1.value + "\n");
			t1 = t1.tail;
		}
		return t;
	}

	@Override
	public Table visit(Exp e) {
		// Nem precisa tocar nisso(eu acho)
		return null;
	}

	@Override
	public Table visit(EseqExp e) {
		Table stm = e.getStm().accept(this);
		Table exp = e.getExp().accept(this);
		Table t = new Table(null, exp.value, null);
		return t;
	}

	@Override
	public Table visit(IdExp e) {
		String id = e.getId();
		Table tempTable = new Table(this.t.id, this.t.value, this.t.tail);
		// Percorrer a table do Interpreter até achar uma table que tenha o mesmo id que o id passado.
		while (!tempTable.id.equals(id)) {
			tempTable = new Table(tempTable.tail.id, tempTable.tail.value, tempTable.tail.tail);
		}
		// Zerar a cauda da table retornada para não printar zuado
		tempTable.tail = null;
		return tempTable;
	}

	@Override
	public Table visit(NumExp e) {
		Table t = new Table(null, e.getNum(), null);
		return t;
	}

	@Override
	public Table visit(OpExp e) {
		// retorna uma table com o os valores passados na expressão
		// Os accepts irão pegar os valores nas tables
		Table t1 = e.getLeft().accept(this);
		Table t2 = e.getRight().accept(this);
		int op = e.getOper();
		Table t = new Table(null, 0, null);
		if(op == 1) {
			t.value = t1.value + t2.value;
		} else if (op == 2) {
			t.value = t1.value - t2.value;
		} else if (op == 3) {
			t.value = t1.value * t2.value;
		} else if (op == 4) {
			t.value = t1.value / t2.value;
		}
		return t;
	}

	@Override
	public Table visit(ExpList el) {
		// Nem precisa tocar nisso(eu acho)
		return null;
	}

	@Override
	public Table visit(PairExpList el) {
		// Quando ocorrer um PairExpList, será retornado uma table com o valor do head o tail do PairExpList, que poderá ser outro PairExpList ou LastExpList
        Table t1 = el.getHead().accept(this);
        Table t2 = el.getTail().accept(this);
		Table t = new Table(null, t1.value, t2);
		return t;
	}

	@Override
	public Table visit(LastExpList el) {
		// System.out.println("Print do visit do LastExpList");
		Table t = el.getHead().accept(this);
		return t;
	}


}
