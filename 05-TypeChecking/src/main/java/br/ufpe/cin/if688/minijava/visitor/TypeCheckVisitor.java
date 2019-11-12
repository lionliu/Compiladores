package br.ufpe.cin.if688.minijava.visitor;

import br.ufpe.cin.if688.minijava.ast.*;
import br.ufpe.cin.if688.minijava.symboltable.Class;
import br.ufpe.cin.if688.minijava.symboltable.Method;
import br.ufpe.cin.if688.minijava.symboltable.SymbolTable;
import br.ufpe.cin.if688.minijava.exceptions.PrintException;
import br.ufpe.cin.if688.minijava.symboltable.Variable;

public class TypeCheckVisitor implements IVisitor<Type> {

	private SymbolTable symbolTable;

	private PrintException printException = new PrintException();

	public TypeCheckVisitor(SymbolTable st) {
		this.symbolTable = st;
	}

	private Class currClass;
	private Method currMethod;

	// MainClass m;
	// ClassDeclList cl;
	public Type visit(Program n) {
		n.m.accept(this);
		for (int i = 0; i < n.cl.size(); i++) {
			n.cl.elementAt(i).accept(this);
		}
		return null;
	}

	// Identifier i1,i2;
	// Statement s;
	public Type visit(MainClass n) {
		n.i1.accept(this);
		n.i2.accept(this);
		n.s.accept(this);
		return null;
	}

	// Identifier i;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclSimple n) {
		n.i.accept(this);
		this.currClass = this.symbolTable.getClass(n.i.toString());
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.currClass = null;
		return null;
	}

	// Identifier i;
	// Identifier j;
	// VarDeclList vl;
	// MethodDeclList ml;
	public Type visit(ClassDeclExtends n) {
		n.i.accept(this);
		n.j.accept(this);
		this.currClass = this.symbolTable.getClass(n.i.toString());
		Class tempClass = this.symbolTable.getClass(n.j.toString());
		if(tempClass == null) {
			this.printException.idNotFound(n.j.toString());
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.ml.size(); i++) {
			n.ml.elementAt(i).accept(this);
		}
		this.currClass = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(VarDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	// Type t;
	// Identifier i;
	// FormalList fl;
	// VarDeclList vl;
	// StatementList sl;
	// Exp e;
	public Type visit(MethodDecl n) {
		n.t.accept(this);
		n.i.accept(this);
		this.currMethod = this.symbolTable.getMethod(n.i.toString(), this.currClass.getId());
		for (int i = 0; i < n.fl.size(); i++) {
			n.fl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.vl.size(); i++) {
			n.vl.elementAt(i).accept(this);
		}
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		n.e.accept(this);

		if(n.e instanceof IdentifierExp) {
			// P/ checar se existe no escopo
			IdentifierExp ie = (IdentifierExp) n.e;
			Type tempType = this.symbolTable.getVarType(this.currMethod, this.currClass, ie.s);
            Type methodType = this.symbolTable.getMethodType(n.i.s, this.currClass.getId());
            if(!this.symbolTable.compareTypes(tempType, methodType)) {
                this.printException.typeMatch(methodType, tempType);
            }
		}


		this.currMethod = null;
		return null;
	}

	// Type t;
	// Identifier i;
	public Type visit(Formal n) {
		n.t.accept(this);
		n.i.accept(this);
		return null;
	}

	public Type visit(IntArrayType n) {
		return n;
	}

	public Type visit(BooleanType n) {
		return n;
	}

	public Type visit(IntegerType n) {
		return n;
	}

	// String s;
	public Type visit(IdentifierType n) {
		return n;
	}

	// StatementList sl;
	public Type visit(Block n) {
		for (int i = 0; i < n.sl.size(); i++) {
			n.sl.elementAt(i).accept(this);
		}
		return null;
	}

	// Exp e;
	// Statement s1,s2;
	public Type visit(If n) {
		if(n.e instanceof IdentifierExp) {
			IdentifierExp exp = (IdentifierExp) n.e;
			Type current = this.symbolTable.getVarType(this.currMethod, this.currClass,exp.s);
			// System.out.println(exp.s);
			if(!this.symbolTable.compareTypes(current, new BooleanType())) {
				this.printException.typeMatch(new BooleanType(), current);
			}
		}

		n.e.accept(this);
		n.s1.accept(this);
		n.s2.accept(this);
		return null;
	}

	// Exp e;
	// Statement s;
	public Type visit(While n) {
		// Exp exp;
		// Deve ter outras instancias.
		if(n.e instanceof IdentifierExp) {
			IdentifierExp exp = (IdentifierExp) n.e;
			Type current = this.symbolTable.getVarType(this.currMethod, this.currClass,exp.s);
			if(!this.symbolTable.compareTypes(current, new BooleanType())) {
				this.printException.typeMatch(new BooleanType(), current);
			}
		}

		n.e.accept(this);
		n.s.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(Print n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	// Exp e;
	public Type visit(Assign n) {
		n.i.accept(this);
		Type actual = n.e.accept(this);
		Type expected = this.symbolTable.getVarType(this.currMethod, this.currClass, n.i.toString());
		// Gambiarra nesse &&
		if(!this.symbolTable.compareTypes(expected, actual) && actual != null) {
			this.printException.typeMatch(expected, actual);
		}
		return null;
	}

	// Identifier i;
	// Exp e1,e2;
	public Type visit(ArrayAssign n) {
		// Não sei se precisa implementar esse.
		n.i.accept(this);
		n.e1.accept(this);
		n.e2.accept(this);
		return null;
	}

	public void isIdentifierOk(Exp e, Type expected) {
		IdentifierExp ie = (IdentifierExp) e;
		Type actual = this.symbolTable.getVarType(this.currMethod, this.currClass, ie.s);
		if(!this.symbolTable.compareTypes(actual, expected)) {
			this.printException.typeMatch(expected, actual);
		}
	}

	public void isOperationOk(Exp e1, Exp e2, Type expected) {
		// Pode estar faltando alguma instancia
		if(e1 instanceof IdentifierExp) {
			isIdentifierOk(e1, expected);
		}

		if(e2 instanceof IdentifierExp) {
			isIdentifierOk(e2, expected);
		}

		if(expected instanceof BooleanType && (e1 instanceof IntegerLiteral || e2 instanceof IntegerLiteral)) {
			this.printException.typeMatch(new BooleanType(), new IntegerType());
		}

		if(expected instanceof IntegerType &&
				((e1 instanceof True || e1 instanceof False || e1 instanceof Not) ||
						(e2 instanceof True || e2 instanceof False || e2 instanceof Not))) {
			this.printException.typeMatch(new IntegerType(), new BooleanType());
		}

	}

	// Exp e1,e2;
	public Type visit(And n) {
		n.e1.accept(this);
		n.e2.accept(this);

		isOperationOk(n.e1, n.e2, new BooleanType());

		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(LessThan n) {
		n.e1.accept(this);
		n.e2.accept(this);

		isOperationOk(n.e1, n.e2, new IntegerType());

		return new BooleanType();
	}

	// Exp e1,e2;
	public Type visit(Plus n) {
		n.e1.accept(this);
		n.e2.accept(this);

		isOperationOk(n.e1, n.e2, new IntegerType());

		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Minus n) {
		n.e1.accept(this);
		n.e2.accept(this);

		isOperationOk(n.e1, n.e2, new IntegerType());
		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(Times n) {
		n.e1.accept(this);
		n.e2.accept(this);

		isOperationOk(n.e1, n.e2, new IntegerType());

		return new IntegerType();
	}

	// Exp e1,e2;
	public Type visit(ArrayLookup n) {
		n.e1.accept(this);
		n.e2.accept(this);
		return null;
	}

	// Exp e;
	public Type visit(ArrayLength n) {
		n.e.accept(this);
		return null;
	}

	// Exp e;
	// Identifier i;
	// ExpList el;
	public Type visit(Call n) {

		n.e.accept(this);
		n.i.accept(this);
		for (int i = 0; i < n.el.size(); i++) {
			n.el.elementAt(i).accept(this);
		}
		// Pode ter outras instancias?
		if(n.e instanceof NewObject) {
			NewObject no = (NewObject) n.e;
			Class tempClass = this.symbolTable.getClass(no.i.toString());
			if(tempClass == null) {
				this.printException.idNotFound(no.i.toString());
			}
			Method m = tempClass.getMethod(n.i.toString());
			if(m == null) {
				this.printException.idNotFound(n.i.toString());
			}
			int paramCount = 0;
			Variable temp;
			do {
				temp = m.getParamAt(paramCount);
				paramCount++;
			} while (temp != null);
			if(n.el.size() > (paramCount - 1)) {
				printException.tooManyArguments(n.i.toString());
			} else if(n.el.size() < (paramCount - 1)) {
				printException.tooFewArguments(n.i.toString());
			}
		}

		return null;
	}

	// int i;
	public Type visit(IntegerLiteral n) {
		return new IntegerType();
	}

	public Type visit(True n) {
		return new BooleanType();
	}

	public Type visit(False n) {
		return new BooleanType();
	}

	// String s;
	public Type visit(IdentifierExp n) {
		return this.symbolTable.getVarType(this.currMethod, this.currClass, n.s);
	}

	public Type visit(This n) {
		return null;
	}

	// Exp e;
	public Type visit(NewArray n) {
		n.e.accept(this);
		return null;
	}

	// Identifier i;
	public Type visit(NewObject n) {
		return null;
	}

	// Exp e;
	public Type visit(Not n) {
		n.e.accept(this);
		return new BooleanType();
	}

	// String s;
	public Type visit(Identifier n) {
		return null;
	}
}
