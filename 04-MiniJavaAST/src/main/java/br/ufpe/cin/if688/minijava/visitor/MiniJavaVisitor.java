package br.ufpe.cin.if688.minijava.visitor;
import br.ufpe.cin.if688.minijava.MiniJavaGrammarParser;
import br.ufpe.cin.if688.minijava.MiniJavaGrammarVisitor;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import br.ufpe.cin.if688.minijava.ast.*;

public class MiniJavaVisitor implements MiniJavaGrammarVisitor{
    @Override
    public Object visitGoal(MiniJavaGrammarParser.GoalContext ctx) {
        return null;
    }

    @Override
    public Object visitMainClass(MiniJavaGrammarParser.MainClassContext ctx) {
//        MainClass mc = new MainClass(ctx.);
        return null;
    }

    @Override
    public Object visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx) {
        return null;
    }

    @Override
    public Object visitType(MiniJavaGrammarParser.TypeContext ctx) {
        return null;
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
    public Object visit(ParseTree parseTree) {

        return null;
    }

    @Override
    public Object visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public Object visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public Object visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
