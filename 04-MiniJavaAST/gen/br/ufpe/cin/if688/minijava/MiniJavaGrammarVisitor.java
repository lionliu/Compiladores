// Generated from E:/Programming/Compiladores/Compiladores/04-MiniJavaAST/src/main/java/br/ufpe/cin/if688/minijava\MiniJavaGrammar.g4 by ANTLR 4.7.2
package br.ufpe.cin.if688.minijava;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniJavaGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniJavaGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#goal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoal(MiniJavaGrammarParser.GoalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#mainClass}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainClass(MiniJavaGrammarParser.MainClassContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#classDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDeclaration(MiniJavaGrammarParser.ClassDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(MiniJavaGrammarParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(MiniJavaGrammarParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(MiniJavaGrammarParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(MiniJavaGrammarParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#statementBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementBlock(MiniJavaGrammarParser.StatementBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#assignID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignID(MiniJavaGrammarParser.AssignIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MiniJavaGrammarParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MiniJavaGrammarParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#printStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(MiniJavaGrammarParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#assignArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignArray(MiniJavaGrammarParser.AssignArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(MiniJavaGrammarParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expNewInt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNewInt(MiniJavaGrammarParser.ExpNewIntContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expNewID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNewID(MiniJavaGrammarParser.ExpNewIDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expNegate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpNegate(MiniJavaGrammarParser.ExpNegateContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#expParent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpParent(MiniJavaGrammarParser.ExpParentContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniJavaGrammarParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(MiniJavaGrammarParser.IdentifierContext ctx);
}