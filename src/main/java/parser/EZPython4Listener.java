// Generated from src\main\java\parser\EZPython4.g4 by ANTLR 4.7.2
 package parser;
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
	 * Enter a parse tree produced by {@link EZPython4Parser#variableReAssignStmt}.
	 * @param ctx the parse tree
	 */
	void enterVariableReAssignStmt(EZPython4Parser.VariableReAssignStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#variableReAssignStmt}.
	 * @param ctx the parse tree
	 */
	void exitVariableReAssignStmt(EZPython4Parser.VariableReAssignStmtContext ctx);
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
	 * Enter a parse tree produced by {@link EZPython4Parser#logicalVal}.
	 * @param ctx the parse tree
	 */
	void enterLogicalVal(EZPython4Parser.LogicalValContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#logicalVal}.
	 * @param ctx the parse tree
	 */
	void exitLogicalVal(EZPython4Parser.LogicalValContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void enterLogicExpr(EZPython4Parser.LogicExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#logicExpr}.
	 * @param ctx the parse tree
	 */
	void exitLogicExpr(EZPython4Parser.LogicExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOR(EZPython4Parser.LogicalORContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#logicalOR}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOR(EZPython4Parser.LogicalORContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#logicalAND}.
	 * @param ctx the parse tree
	 */
	void enterLogicalAND(EZPython4Parser.LogicalANDContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#logicalAND}.
	 * @param ctx the parse tree
	 */
	void exitLogicalAND(EZPython4Parser.LogicalANDContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void enterLogicalTerm(EZPython4Parser.LogicalTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#logicalTerm}.
	 * @param ctx the parse tree
	 */
	void exitLogicalTerm(EZPython4Parser.LogicalTermContext ctx);
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
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(EZPython4Parser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(EZPython4Parser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#codeSection}.
	 * @param ctx the parse tree
	 */
	void enterCodeSection(EZPython4Parser.CodeSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#codeSection}.
	 * @param ctx the parse tree
	 */
	void exitCodeSection(EZPython4Parser.CodeSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(EZPython4Parser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(EZPython4Parser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#funcStmt}.
	 * @param ctx the parse tree
	 */
	void enterFuncStmt(EZPython4Parser.FuncStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#funcStmt}.
	 * @param ctx the parse tree
	 */
	void exitFuncStmt(EZPython4Parser.FuncStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void enterFuncCall(EZPython4Parser.FuncCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#funcCall}.
	 * @param ctx the parse tree
	 */
	void exitFuncCall(EZPython4Parser.FuncCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link EZPython4Parser#printFunc}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunc(EZPython4Parser.PrintFuncContext ctx);
	/**
	 * Exit a parse tree produced by {@link EZPython4Parser#printFunc}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunc(EZPython4Parser.PrintFuncContext ctx);
}