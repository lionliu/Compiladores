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

public class MaxArgsVisitor implements IVisitor<Integer> {

	@Override
	public Integer visit(Stm s) {
		// Primeiro visitor a ser chamado
		// Vai chamar no seu accept o visit do seu primeiro new
		return s.accept(this);
	}

	@Override
	public Integer visit(AssignStm s) {
		return s.getExp().accept(this);
	}

	@Override
	public Integer visit(CompoundStm s) {
		int esq = s.getStm1().accept(this);
		int dir = s.getStm2().accept(this);
		return Math.max(esq, dir);
	}

	@Override
	public Integer visit(PrintStm s) {
		// Retorna exatamente o que recebeu
		int x = s.getExps().accept(this);
		return x;
	}

	@Override
	public Integer visit(Exp e) {
		// Nem precisa implementar
		return null;
	}

	@Override
	public Integer visit(EseqExp e) {
		// Retorna o máximo das duas expressões
		int y = e.getStm().accept(this);
		int x = e.getExp().accept(this);
		return Math.max(x, y);
	}

	// Deixar com 0 mesmo;
	@Override
	public Integer visit(IdExp e) {
		return 0;
	}

	@Override
	public Integer visit(NumExp e) {
		return 0;
	}

	@Override
	public Integer visit(OpExp e) {
		// Quando ocorre uma operacao, é como fosse um exp novo, por isso retorna 0;
		return 0;
	}

	@Override
	public Integer visit(ExpList el) {
		// Nem precisa implementar
		return null;
	}

	@Override
	public Integer visit(PairExpList el) {
		int x = el.getHead().accept(this);
		int y = el.getTail().accept(this);
		// Se o head for uma exp, soma 1 para se ter um retorno.
		if(x == 0) x++;
		return x + y;
	}

	@Override
	public Integer visit(LastExpList el) {
		int x = el.getHead().accept(this);
		// Se o head for uma exp, soma 1 para se ter um retorno.
		if(x == 0) x++;
		return x;
	}

}
