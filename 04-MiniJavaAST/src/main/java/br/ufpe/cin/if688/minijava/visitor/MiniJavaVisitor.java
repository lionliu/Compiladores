package br.ufpe.cin.if688.minijava.visitor;
import br.ufpe.cin.if688.minijava.MiniJavaGrammarParser;
import br.ufpe.cin.if688.minijava.MiniJavaGrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import br.ufpe.cin.if688.minijava.ast.*;

public class MiniJavaVisitor implements MiniJavaGrammarVisitor{

    private Program goal;
    private MainClass mc;
    private ClassDecl cd;
    private VarDecl vd;
    private MethodDecl md;
    private Type type;
    private Statement stm;
    private Exp exp;
    private Identifier id;
    private String symbol;


    @Override
    public Object visitGoal(MiniJavaGrammarParser.GoalContext ctx) {
        ctx.mainClass().accept(this);
        MainClass mainClass = this.mc;
        ClassDeclList cdl = new ClassDeclList();

        for(MiniJavaGrammarParser.ClassDeclarationContext cdc: ctx.classDeclaration()) {
            cdc.accept(this);
            cdl.addElement(this.cd);
        }

        this.goal = new Program(mainClass, cdl);
        return this.goal;
    }

    @Override
    public Object visitMainClass(MiniJavaGrammarParser.MainClassContext ctx) {
        ctx.identifier(0).accept(this);
        Identifier tempId = this.id;
        ctx.identifier(1).accept(this);
        ctx.statement().accept(this);

        this.mc = new MainClass(tempId, this.id, this.stm);
        return this.goal;
    }

    @Override
    public Object visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx) {
        ctx.identifier(0).accept(this);
        Identifier className = this.id;
        MiniJavaGrammarParser.IdentifierContext extendNameCtx = ctx.identifier(1);

        VarDeclList vdl = new VarDeclList();
        MethodDeclList mdl = new MethodDeclList();

        if(extendNameCtx != null) {
            extendNameCtx.accept(this);
            this.cd = new ClassDeclExtends(className, this.id, vdl, mdl);
        } else {
            this.cd = new ClassDeclSimple(className, vdl, mdl);
        }

        for (MiniJavaGrammarParser.VarDeclarationContext vdc : ctx.varDeclaration()) {
            vdc.accept(this);
            vdl.addElement(this.vd);
        }

        for (MiniJavaGrammarParser.MethodDeclarationContext mdc : ctx.methodDeclaration()) {
            mdc.accept(this);
            mdl.addElement(this.md);
        }
        return this.goal;
    }

    @Override
    public Object visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx) {
        ctx.type().accept(this);
        ctx.identifier().accept(this);
        VarDecl vd = new VarDecl(this.type, this.id);
        this.vd = vd;
        return this.goal;
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        ctx.type(0).accept(this);
        ctx.identifier(0).accept(this);
        ctx.expression().accept(this);
        VarDeclList vdl = new VarDeclList();
        StatementList sl = new StatementList();

        this.md = new MethodDecl(this.type, this.id, new FormalList(), vdl, sl, this.exp);

        if(ctx.type(1) != null) {
            for (int i = 1; i < ctx.type().size(); i++) {
                ctx.type(i).accept(this);
                Type parameterType = this.type;

                ctx.identifier(i).accept(this);
                Identifier parameterIdentifier = this.id;

                Formal formal = new Formal(parameterType, parameterIdentifier);

                this.md.fl.addElement(formal);
            }

        }

        for (MiniJavaGrammarParser.VarDeclarationContext varDeclCtx : ctx.varDeclaration()) {
            varDeclCtx.accept(this);
            vdl.addElement(this.vd);
        }

        for (MiniJavaGrammarParser.StatementContext stmCtx : ctx.statement()) {
            stmCtx.accept(this);
            sl.addElement(this.stm);
        }

        return this.goal;
    }

    @Override
    public Object visitType(MiniJavaGrammarParser.TypeContext ctx) {
        if(ctx.Boolean() != null) {
            this.type = new BooleanType();
        } else if(ctx.Int() != null) {
            this.type = new IntegerType();
        } else if(ctx.IntArray() != null) {
            this.type = new IntArrayType();
        } else {
            ctx.identifier().accept(this);
            this.type = new IdentifierType(this.id.toString());
        }
        return this.goal;
    }

    @Override
    public Object visitStatement(MiniJavaGrammarParser.StatementContext ctx) {
        if(ctx.statementBlock() != null) {
            ctx.statementBlock().accept(this);
        } else if(ctx.assignID() != null) {
            ctx.assignID().accept(this);
        } else if(ctx.whileStatement() != null) {
            ctx.whileStatement().accept(this);
        } else if(ctx.printStatement() != null) {
            ctx.printStatement().accept(this);
        } else if(ctx.ifStatement() != null) {
            ctx.ifStatement().accept(this);
        } else if(ctx.assignArray() != null) {
            ctx.assignArray().accept(this);
        }
        return this.goal;
    }

    @Override
    public Object visitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx) {
        StatementList sl = new StatementList();
        for (MiniJavaGrammarParser.StatementContext sc : ctx.statement()) {
            sc.accept(this);
            sl.addElement(this.stm);
        }
        this.stm = new Block(sl);
        return this.goal;
    }

    @Override
    public Object visitAssignID(MiniJavaGrammarParser.AssignIDContext ctx) {
        ctx.identifier().accept(this);
        ctx.expression().accept(this);
        this.stm = new Assign(this.id, this.exp);
        return this.goal;
    }

    @Override
    public Object visitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx) {
        ctx.expression().accept(this);
        ctx.statement().accept(this);
        this.stm = new While(this.exp, this.stm);
        return this.goal;
    }

    @Override
    public Object visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx) {
        ctx.expression().accept(this);
        ctx.statement(0).accept(this);
        Statement tempStm = this.stm;
        ctx.statement(1).accept(this);
        this.stm = new If(this.exp, tempStm, this.stm);
        return this.goal;
    }

    @Override
    public Object visitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx) {
        ctx.expression().accept(this);
        this.stm = new Print(this.exp);
        return this.goal;
    }

    @Override
    public Object visitAssignArray(MiniJavaGrammarParser.AssignArrayContext ctx) {
        ctx.identifier().accept(this);
        ctx.expression(0).accept(this);
        Exp tempExp = this.exp;
        ctx.expression(1).accept(this);
        this.stm = new ArrayAssign(this.id, tempExp, this.exp);
        return this.goal;
    }

    @Override
    public Object visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {
        if(ctx.ExpTrue() != null) {
            this.exp = new True();
        } else if(ctx.ExpFalse() != null) {
            this.exp = new False();
        } else if(ctx.ExpThis() != null) {
            this.exp = new This();
        } else if(ctx.ExpNumber() != null) {

        }
        return this.goal;
    }

    @Override
    public Object visitExpNewInt(MiniJavaGrammarParser.ExpNewIntContext ctx) {
        return this.goal;
    }

    @Override
    public Object visitExpNewID(MiniJavaGrammarParser.ExpNewIDContext ctx) {
        return this.goal;
    }

    @Override
    public Object visitExpNegate(MiniJavaGrammarParser.ExpNegateContext ctx) {
        return this.goal;
    }

    @Override
    public Object visitExpParent(MiniJavaGrammarParser.ExpParentContext ctx) {
        return this.goal;
    }

    @Override
    public Object visitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx) {
        ctx.Identifier().accept(this);

        this.id = new Identifier(this.symbol);
        return this.goal;
    }

    @Override
    public Object visit(ParseTree parseTree) {
        parseTree.accept(this);
        return this.goal;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        System.out.println(ruleNode);
        return ruleNode.accept(this);
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        this.symbol = terminalNode.getSymbol().getText();
        return this.goal;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        System.out.println(errorNode);
        return errorNode.accept(this);
    }
}
