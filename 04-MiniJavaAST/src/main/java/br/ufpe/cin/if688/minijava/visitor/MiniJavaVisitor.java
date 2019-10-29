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

        // implementar o accept das variáveis

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

        return null;
    }

    @Override
    public Object visitExpression(MiniJavaGrammarParser.ExpressionContext ctx) {

        return null;
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
