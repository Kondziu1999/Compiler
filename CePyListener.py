# Generated from ../../CePy.g4 by ANTLR 4.7.2
from antlr4 import *
if __name__ is not None and "." in __name__:
    from .CePyParser import CePyParser
else:
    from CePyParser import CePyParser

# This class defines a complete listener for a parse tree produced by CePyParser.
class CePyListener(ParseTreeListener):

    # Enter a parse tree produced by CePyParser#program.
    def enterProgram(self, ctx:CePyParser.ProgramContext):
        pass

    # Exit a parse tree produced by CePyParser#program.
    def exitProgram(self, ctx:CePyParser.ProgramContext):
        pass


    # Enter a parse tree produced by CePyParser#argList.
    def enterArgList(self, ctx:CePyParser.ArgListContext):
        pass

    # Exit a parse tree produced by CePyParser#argList.
    def exitArgList(self, ctx:CePyParser.ArgListContext):
        pass


    # Enter a parse tree produced by CePyParser#value.
    def enterValue(self, ctx:CePyParser.ValueContext):
        pass

    # Exit a parse tree produced by CePyParser#value.
    def exitValue(self, ctx:CePyParser.ValueContext):
        pass


    # Enter a parse tree produced by CePyParser#number.
    def enterNumber(self, ctx:CePyParser.NumberContext):
        pass

    # Exit a parse tree produced by CePyParser#number.
    def exitNumber(self, ctx:CePyParser.NumberContext):
        pass


    # Enter a parse tree produced by CePyParser#numberType.
    def enterNumberType(self, ctx:CePyParser.NumberTypeContext):
        pass

    # Exit a parse tree produced by CePyParser#numberType.
    def exitNumberType(self, ctx:CePyParser.NumberTypeContext):
        pass


    # Enter a parse tree produced by CePyParser#funcCall.
    def enterFuncCall(self, ctx:CePyParser.FuncCallContext):
        pass

    # Exit a parse tree produced by CePyParser#funcCall.
    def exitFuncCall(self, ctx:CePyParser.FuncCallContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalVal.
    def enterLogicalVal(self, ctx:CePyParser.LogicalValContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalVal.
    def exitLogicalVal(self, ctx:CePyParser.LogicalValContext):
        pass


    # Enter a parse tree produced by CePyParser#listElem.
    def enterListElem(self, ctx:CePyParser.ListElemContext):
        pass

    # Exit a parse tree produced by CePyParser#listElem.
    def exitListElem(self, ctx:CePyParser.ListElemContext):
        pass


    # Enter a parse tree produced by CePyParser#listVal.
    def enterListVal(self, ctx:CePyParser.ListValContext):
        pass

    # Exit a parse tree produced by CePyParser#listVal.
    def exitListVal(self, ctx:CePyParser.ListValContext):
        pass


    # Enter a parse tree produced by CePyParser#type.
    def enterType(self, ctx:CePyParser.TypeContext):
        pass

    # Exit a parse tree produced by CePyParser#type.
    def exitType(self, ctx:CePyParser.TypeContext):
        pass


    # Enter a parse tree produced by CePyParser#stmt.
    def enterStmt(self, ctx:CePyParser.StmtContext):
        pass

    # Exit a parse tree produced by CePyParser#stmt.
    def exitStmt(self, ctx:CePyParser.StmtContext):
        pass


    # Enter a parse tree produced by CePyParser#expr.
    def enterExpr(self, ctx:CePyParser.ExprContext):
        pass

    # Exit a parse tree produced by CePyParser#expr.
    def exitExpr(self, ctx:CePyParser.ExprContext):
        pass


    # Enter a parse tree produced by CePyParser#variableStmt.
    def enterVariableStmt(self, ctx:CePyParser.VariableStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#variableStmt.
    def exitVariableStmt(self, ctx:CePyParser.VariableStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#arithmExpr.
    def enterArithmExpr(self, ctx:CePyParser.ArithmExprContext):
        pass

    # Exit a parse tree produced by CePyParser#arithmExpr.
    def exitArithmExpr(self, ctx:CePyParser.ArithmExprContext):
        pass


    # Enter a parse tree produced by CePyParser#term.
    def enterTerm(self, ctx:CePyParser.TermContext):
        pass

    # Exit a parse tree produced by CePyParser#term.
    def exitTerm(self, ctx:CePyParser.TermContext):
        pass


    # Enter a parse tree produced by CePyParser#logicExpr.
    def enterLogicExpr(self, ctx:CePyParser.LogicExprContext):
        pass

    # Exit a parse tree produced by CePyParser#logicExpr.
    def exitLogicExpr(self, ctx:CePyParser.LogicExprContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalOR.
    def enterLogicalOR(self, ctx:CePyParser.LogicalORContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalOR.
    def exitLogicalOR(self, ctx:CePyParser.LogicalORContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalAND.
    def enterLogicalAND(self, ctx:CePyParser.LogicalANDContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalAND.
    def exitLogicalAND(self, ctx:CePyParser.LogicalANDContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalTerm.
    def enterLogicalTerm(self, ctx:CePyParser.LogicalTermContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalTerm.
    def exitLogicalTerm(self, ctx:CePyParser.LogicalTermContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalNOT.
    def enterLogicalNOT(self, ctx:CePyParser.LogicalNOTContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalNOT.
    def exitLogicalNOT(self, ctx:CePyParser.LogicalNOTContext):
        pass


    # Enter a parse tree produced by CePyParser#logicalResult.
    def enterLogicalResult(self, ctx:CePyParser.LogicalResultContext):
        pass

    # Exit a parse tree produced by CePyParser#logicalResult.
    def exitLogicalResult(self, ctx:CePyParser.LogicalResultContext):
        pass


    # Enter a parse tree produced by CePyParser#loopStmt.
    def enterLoopStmt(self, ctx:CePyParser.LoopStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#loopStmt.
    def exitLoopStmt(self, ctx:CePyParser.LoopStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#foreachStmt.
    def enterForeachStmt(self, ctx:CePyParser.ForeachStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#foreachStmt.
    def exitForeachStmt(self, ctx:CePyParser.ForeachStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#ifStmt.
    def enterIfStmt(self, ctx:CePyParser.IfStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#ifStmt.
    def exitIfStmt(self, ctx:CePyParser.IfStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#elifStmt.
    def enterElifStmt(self, ctx:CePyParser.ElifStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#elifStmt.
    def exitElifStmt(self, ctx:CePyParser.ElifStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#elseStmt.
    def enterElseStmt(self, ctx:CePyParser.ElseStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#elseStmt.
    def exitElseStmt(self, ctx:CePyParser.ElseStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#bracedCodeSection.
    def enterBracedCodeSection(self, ctx:CePyParser.BracedCodeSectionContext):
        pass

    # Exit a parse tree produced by CePyParser#bracedCodeSection.
    def exitBracedCodeSection(self, ctx:CePyParser.BracedCodeSectionContext):
        pass


    # Enter a parse tree produced by CePyParser#codeSection.
    def enterCodeSection(self, ctx:CePyParser.CodeSectionContext):
        pass

    # Exit a parse tree produced by CePyParser#codeSection.
    def exitCodeSection(self, ctx:CePyParser.CodeSectionContext):
        pass


    # Enter a parse tree produced by CePyParser#funcStmt.
    def enterFuncStmt(self, ctx:CePyParser.FuncStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#funcStmt.
    def exitFuncStmt(self, ctx:CePyParser.FuncStmtContext):
        pass


    # Enter a parse tree produced by CePyParser#returnStmt.
    def enterReturnStmt(self, ctx:CePyParser.ReturnStmtContext):
        pass

    # Exit a parse tree produced by CePyParser#returnStmt.
    def exitReturnStmt(self, ctx:CePyParser.ReturnStmtContext):
        pass


