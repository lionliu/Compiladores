// Generated from E:/Programming/Compiladores/CompiladoresRepo/04-MiniJavaAST/src/main/java/br/ufpe/cin/if688/minijava\MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniJavaGrammarParser}.
 */
public interface MiniJavaGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void enterGoal(MiniJavaGrammarParser.GoalContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#goal}.
	 * @param ctx the parse tree
	 */
	void exitGoal(MiniJavaGrammarParser.GoalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void enterMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 */
	void exitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#assignID}.
	 * @param ctx the parse tree
	 */
	void enterAssignID(MiniJavaGrammarParser.AssignIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#assignID}.
	 * @param ctx the parse tree
	 */
	void exitAssignID(MiniJavaGrammarParser.AssignIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#assignArray}.
	 * @param ctx the parse tree
	 */
	void enterAssignArray(MiniJavaGrammarParser.AssignArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#assignArray}.
	 * @param ctx the parse tree
	 */
	void exitAssignArray(MiniJavaGrammarParser.AssignArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expTrue}.
	 * @param ctx the parse tree
	 */
	void enterExpTrue(MiniJavaGrammarParser.ExpTrueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expTrue}.
	 * @param ctx the parse tree
	 */
	void exitExpTrue(MiniJavaGrammarParser.ExpTrueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expFalse}.
	 * @param ctx the parse tree
	 */
	void enterExpFalse(MiniJavaGrammarParser.ExpFalseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expFalse}.
	 * @param ctx the parse tree
	 */
	void exitExpFalse(MiniJavaGrammarParser.ExpFalseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expThis}.
	 * @param ctx the parse tree
	 */
	void enterExpThis(MiniJavaGrammarParser.ExpThisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expThis}.
	 * @param ctx the parse tree
	 */
	void exitExpThis(MiniJavaGrammarParser.ExpThisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expNumber}.
	 * @param ctx the parse tree
	 */
	void enterExpNumber(MiniJavaGrammarParser.ExpNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expNumber}.
	 * @param ctx the parse tree
	 */
	void exitExpNumber(MiniJavaGrammarParser.ExpNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expNewInt}.
	 * @param ctx the parse tree
	 */
	void enterExpNewInt(MiniJavaGrammarParser.ExpNewIntContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expNewInt}.
	 * @param ctx the parse tree
	 */
	void exitExpNewInt(MiniJavaGrammarParser.ExpNewIntContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expNewID}.
	 * @param ctx the parse tree
	 */
	void enterExpNewID(MiniJavaGrammarParser.ExpNewIDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expNewID}.
	 * @param ctx the parse tree
	 */
	void exitExpNewID(MiniJavaGrammarParser.ExpNewIDContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expNegate}.
	 * @param ctx the parse tree
	 */
	void enterExpNegate(MiniJavaGrammarParser.ExpNegateContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expNegate}.
	 * @param ctx the parse tree
	 */
	void exitExpNegate(MiniJavaGrammarParser.ExpNegateContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#expParent}.
	 * @param ctx the parse tree
	 */
	void enterExpParent(MiniJavaGrammarParser.ExpParentContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#expParent}.
	 * @param ctx the parse tree
	 */
	void exitExpParent(MiniJavaGrammarParser.ExpParentContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
}