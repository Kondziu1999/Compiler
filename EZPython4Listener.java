// Generated from ../../EZPython4.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link EZPython4Parser}.
 */
public interface EZPython4Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(EZPython4Parser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(EZPython4Parser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void enterStmt(EZPython4Parser.StmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#stmt}.
	 * @param ctx the parse tree
	 */
	void exitStmt(EZPython4Parser.StmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(EZPython4Parser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(EZPython4Parser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#arithmExpr}.
	 * @param ctx the parse tree
	 */
	void enterArithmExpr(EZPython4Parser.ArithmExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#arithmExpr}.
	 * @param ctx the parse tree
	 */
	void exitArithmExpr(EZPython4Parser.ArithmExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(EZPython4Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(EZPython4Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableStmt(EZPython4Parser.VariableStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#variableStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableStmt(EZPython4Parser.VariableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#value}.
	 * @param ctx the parse tree
	 */
	void enterValue(EZPython4Parser.ValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#value}.
	 * @param ctx the parse tree
	 */
	void exitValue(EZPython4Parser.ValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#number}.
	 * @param ctx the parse tree
	 */
	void enterNumber(EZPython4Parser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#number}.
	 * @param ctx the parse tree
	 */
	void exitNumber(EZPython4Parser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(EZPython4Parser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(EZPython4Parser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#numberType}.
	 * @param ctx the parse tree
	 */
	void enterNumberType(EZPython4Parser.NumberTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#numberType}.
	 * @param ctx the parse tree
	 */
	void exitNumberType(EZPython4Parser.NumberTypeContext ctx);
}