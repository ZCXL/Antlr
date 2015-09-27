// Generated from CMM.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CMMParser}.
 */
public interface CMMListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(CMMParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(CMMParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(CMMParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(CMMParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#singleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpr(CMMParser.SingleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#singleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpr(CMMParser.SingleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#ioStat}.
	 * @param ctx the parse tree
	 */
	void enterIoStat(CMMParser.IoStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#ioStat}.
	 * @param ctx the parse tree
	 */
	void exitIoStat(CMMParser.IoStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#declrStat}.
	 * @param ctx the parse tree
	 */
	void enterDeclrStat(CMMParser.DeclrStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#declrStat}.
	 * @param ctx the parse tree
	 */
	void exitDeclrStat(CMMParser.DeclrStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void enterAssignStat(CMMParser.AssignStatContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#assignStat}.
	 * @param ctx the parse tree
	 */
	void exitAssignStat(CMMParser.AssignStatContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#write}.
	 * @param ctx the parse tree
	 */
	void enterWrite(CMMParser.WriteContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#write}.
	 * @param ctx the parse tree
	 */
	void exitWrite(CMMParser.WriteContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(CMMParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(CMMParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void enterMultiExpr(CMMParser.MultiExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#multiExpr}.
	 * @param ctx the parse tree
	 */
	void exitMultiExpr(CMMParser.MultiExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void enterIfExpr(CMMParser.IfExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#ifExpr}.
	 * @param ctx the parse tree
	 */
	void exitIfExpr(CMMParser.IfExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileExpr(CMMParser.WhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#whileExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileExpr(CMMParser.WhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#whileDoExpr}.
	 * @param ctx the parse tree
	 */
	void enterWhileDoExpr(CMMParser.WhileDoExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#whileDoExpr}.
	 * @param ctx the parse tree
	 */
	void exitWhileDoExpr(CMMParser.WhileDoExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#doWhileExpr}.
	 * @param ctx the parse tree
	 */
	void enterDoWhileExpr(CMMParser.DoWhileExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#doWhileExpr}.
	 * @param ctx the parse tree
	 */
	void exitDoWhileExpr(CMMParser.DoWhileExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#functionDeclr}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclr(CMMParser.FunctionDeclrContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#functionDeclr}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclr(CMMParser.FunctionDeclrContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameters(CMMParser.FormalParametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#formalParameters}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameters(CMMParser.FormalParametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameter(CMMParser.FormalParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#formalParameter}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameter(CMMParser.FormalParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#anotationExpr}.
	 * @param ctx the parse tree
	 */
	void enterAnotationExpr(CMMParser.AnotationExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#anotationExpr}.
	 * @param ctx the parse tree
	 */
	void exitAnotationExpr(CMMParser.AnotationExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(CMMParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(CMMParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(CMMParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(CMMParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#exprList}.
	 * @param ctx the parse tree
	 */
	void enterExprList(CMMParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#exprList}.
	 * @param ctx the parse tree
	 */
	void exitExprList(CMMParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(CMMParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link CMMParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(CMMParser.TypeContext ctx);
}