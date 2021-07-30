// Generated from C:/Users/salon/IdeaProjects/SER502try/src/antlr4\IJARPL.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link IJARPLParser}.
 */
public interface IJARPLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(IJARPLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(IJARPLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(IJARPLParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(IJARPLParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(IJARPLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(IJARPLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(IJARPLParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(IJARPLParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(IJARPLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(IJARPLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void enterWhile_cond(IJARPLParser.While_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#while_cond}.
	 * @param ctx the parse tree
	 */
	void exitWhile_cond(IJARPLParser.While_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void enterIf_cond(IJARPLParser.If_condContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#if_cond}.
	 * @param ctx the parse tree
	 */
	void exitIf_cond(IJARPLParser.If_condContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(IJARPLParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(IJARPLParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop_statement(IJARPLParser.For_loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#for_loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop_statement(IJARPLParser.For_loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(IJARPLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(IJARPLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void enterAssign_expr(IJARPLParser.Assign_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#assign_expr}.
	 * @param ctx the parse tree
	 */
	void exitAssign_expr(IJARPLParser.Assign_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void enterArith_expr(IJARPLParser.Arith_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#arith_expr}.
	 * @param ctx the parse tree
	 */
	void exitArith_expr(IJARPLParser.Arith_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void enterComp_expr(IJARPLParser.Comp_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#comp_expr}.
	 * @param ctx the parse tree
	 */
	void exitComp_expr(IJARPLParser.Comp_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#comp_phrase}.
	 * @param ctx the parse tree
	 */
	void enterComp_phrase(IJARPLParser.Comp_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#comp_phrase}.
	 * @param ctx the parse tree
	 */
	void exitComp_phrase(IJARPLParser.Comp_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void enterComp_operator(IJARPLParser.Comp_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#comp_operator}.
	 * @param ctx the parse tree
	 */
	void exitComp_operator(IJARPLParser.Comp_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void enterLogic_expr(IJARPLParser.Logic_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#logic_expr}.
	 * @param ctx the parse tree
	 */
	void exitLogic_expr(IJARPLParser.Logic_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#logic_phrase}.
	 * @param ctx the parse tree
	 */
	void enterLogic_phrase(IJARPLParser.Logic_phraseContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#logic_phrase}.
	 * @param ctx the parse tree
	 */
	void exitLogic_phrase(IJARPLParser.Logic_phraseContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void enterLogic_operator(IJARPLParser.Logic_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#logic_operator}.
	 * @param ctx the parse tree
	 */
	void exitLogic_operator(IJARPLParser.Logic_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(IJARPLParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(IJARPLParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link IJARPLParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(IJARPLParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link IJARPLParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(IJARPLParser.PrintContext ctx);
}