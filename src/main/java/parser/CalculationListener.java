package parser;

import data.*;
import javafx.util.Pair;
import logic.*;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.TerminalNode;
import plotter.MatrixAggregator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;


public class CalculationListener extends EZPython4BaseListener {

    private Stack<Instruction> instructionStack = new Stack<>();
    private MatrixAggregator aggregator;

    private FirstPhaseStack stack;
    
    // OUR STUFF:
    private Stack<Double> arithmValues = new Stack<Double>();
    private Stack<Boolean> logicValues = new Stack<Boolean>();
    private Stack<String> stringValues = new Stack<String>();



    private int mainInstructionStackNum = 0;
    private Stack<Integer> whileInstructionsCounter = new Stack<Integer>();
    private Stack<Integer> arithExprStack = new Stack<Integer>();
    private Stack<Boolean> logicExprStack = new Stack<Boolean>();
    private String currentFunctionName = "";
    //private Where lastWhere = Where.empty();

    public CalculationListener(MatrixAggregator aggregator) {
        this.aggregator = aggregator;
        stack = new FirstPhaseStack();
    }

    public boolean CheckInstructionStack(){
        var result = true;
        for (var ins : instructionStack) {
            if(!ins.check()){
                result = false;
            }
        }
        return result;
    }

    public void RunStack(){
        instructionStack.forEach(ins -> {
            System.out.println(ins.toString() +   " -> " + ins.Do());
        });
    }

    public void ListInstructionsStack(){
        System.out.println("Instrucion Stack: ");
        instructionStack.forEach(e-> System.out.println(e.toString()));
    }


//    @Override
//    public void enterComplex_number(CalculatorParser.Complex_numberContext ctx) {
//        int count = ctx.getChildCount();
//        if(count == 1){
//            Double realPart = Double.parseDouble(ctx.getChild(0).getText());
//            stack.push(new ComplexDouble(realPart,0.0));
//        }
//        else if(count == 4){
//            Double realPart = Double.parseDouble(ctx.getChild(0).getText());
//            Double imaginaryPart;
//            imaginaryPart = Double.parseDouble(ctx.getChild(2).getText());
//            if(ctx.getChild(1).getText().equals("+")){
//                stack.push(new ComplexDouble(realPart,imaginaryPart));
//            }else{
//                stack.push(new ComplexDouble(realPart,-imaginaryPart));
//            }
//        }
//    }
    @Override public void enterVariableStmt(EZPython4Parser.VariableStmtContext ctx) {

        //Variable variable =  new Variable(ctx.value().getText(), variableRegister);
        //stack.push(variable);
        //System.out.println(variable.toString());

    }

    @Override public void exitVariableStmt(EZPython4Parser.VariableStmtContext ctx) {

        var name = ctx.VARIABLE_T().getText();
        var type = ctx.type() == null ? ctx.BOOL_TYPE_T() : ctx.type();
        var value = ctx.value();
        if(value != null){
            arithmValues.push(Double.parseDouble(value.getText()));
        }

        switch (type.getText()) {
            case "bool":
            {
                var boolVariable = new BoolVariable(name, logicValues.pop());

                BoolsVariableContainer.setVariable(boolVariable);
                System.out.println(boolVariable.value.toString());
            }
            break;
            case "int":
            {
                var numberVariable = new NumberVariable(name, arithmValues.pop());

                NumbersVariableContainer.setVariable(numberVariable);
                System.out.println(numberVariable.value.toString());
            }
            break;
            case "string":
            {
                var stringVariable = new StringVariable(name, stringValues.pop());

                StringsVariableContainer.setVariable(stringVariable);
                System.out.println(stringVariable.value.toString());
            }
            break;
        }

    }


    @Override public void exitArithmExpr(EZPython4Parser.ArithmExprContext ctx) {
        var childCount = ctx.getChildCount();
        for(int x= 0; x< ctx.getChildCount();x++){

            System.out.println(x + "---" + ctx.getChild(x).getText());
        }

//        if (childCount == 1 && !(isArithm(ctx.getChild(0)))) {
//            if (hasParentThatCouldBeEvaluated(ctx.getParent())) {
//                return; // Bo parent sobie stacka da
//            }
//            arithmValues.push(Double.parseDouble(ctx.getChild(0).getText()));
//        }

        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var arithmExpression = new ArithmExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            System.out.println("stackarith" + arithmExpression.evaluate().toString());
            arithmValues.push(arithmExpression.evaluate());
        }
    }

     private boolean hasParentThatCouldBeEvaluated(ParserRuleContext ctx) {
         return ctx.getRuleContext() instanceof EZPython4Parser.ArithmExprContext || ctx.getRuleContext() instanceof EZPython4Parser.TermContext;
     }

     private boolean hasParentThatCouldBeEvaluated2(ParserRuleContext ctx) {
         return ctx.getRuleContext() instanceof EZPython4Parser.LogicExprContext;
     }

     private boolean isTerm(ParseTree child) {
         return (child.getText().contains("*") || child.getText().contains("/"));
     }

    private boolean isArithm(ParseTree child) {
        return (child.getText().contains("+") || child.getText().contains("-"));
    }

    private boolean isLogic(ParseTree child) {
        return (child.getText().contains("or") || child.getText().contains("and"));
    }

    @Override public void exitTerm(EZPython4Parser.TermContext ctx) {
        var childCount = ctx.getChildCount();
        for(int x= 0; x< ctx.getChildCount();x++){
            System.out.println(x + "+++" + ctx.getChild(x).getText());
        }

//        if (childCount == 1 && !(isTerm(ctx.getChild(0)))) {
//            if (hasParentThatCouldBeEvaluated(ctx.getParent())) {
//                return; // Bo parent sobie stacka da
//            }
//            arithmValues.push(Double.parseDouble(ctx.getChild(0).getText()));
//        }


        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var termExpression = new TermExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            System.out.println("stackterm" + termExpression.evaluate().toString());
            arithmValues.push(termExpression.evaluate());
        }
    }



    @Override public void exitLogicExpr(EZPython4Parser.LogicExprContext ctx) {
        var childCount = ctx.getChildCount();
        for(int x= 0; x< ctx.getChildCount();x++){
            System.out.println(x + "bool" + ctx.getChild(x).getText());
        }

        if (childCount == 1 && !(isLogic(ctx.getChild(0)))) {
            if (hasParentThatCouldBeEvaluated2(ctx.getParent())) {
                return; // Bo parent sobie stacka da
            }
            logicValues.push(Boolean.parseBoolean(ctx.getChild(0).getText()));
        }

        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicExpression = new LogicExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicExpression.evaluate());
        }

    }
    @Override public void exitLogicalOR(EZPython4Parser.LogicalORContext ctx) {
        var childCount = ctx.getChildCount();
        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicExpression = new LogicExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicExpression.evaluate());
        }
    }
    @Override public void exitLogicalAND(EZPython4Parser.LogicalANDContext ctx) {
        var childCount = ctx.getChildCount();
        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicExpression = new LogicExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicExpression.evaluate());
        }
    }

    @Override public void exitLogicalTerm(EZPython4Parser.LogicalTermContext ctx) {
        var childCount = ctx.getChildCount();
        for(int x= 0; x< ctx.getChildCount();x++){
            System.out.println(x + "bool" + ctx.getChild(x).getText());
        }

        if (childCount == 1 && !(ctx.getChild(0).getText().contains("and") || ctx.getChild(0).getText().contains("or"))) {
            if (hasParentThatCouldBeEvaluated2(ctx.getParent())) {
                return; // Bo parent sobie stacka da
            }
            logicValues.push(Boolean.parseBoolean(ctx.getChild(0).getText()));
        }

        if (childCount >= 3) // to rozpatrujemy tylko
        {
            var logicTermExpression = new LogicTermExpression(ctx.getChild(0), ctx.getChild(2), ctx.getChild(1));

            logicValues.push(logicTermExpression.evaluate());
        }

    }

    @Override public void exitWhileStmt(EZPython4Parser.WhileStmtContext ctx) {
        
    }

//    @Override
//    public void exitFunction_call(CalculatorParser.Function_callContext ctx) {
//        if(ctx.getParent().getRuleIndex() == CalculatorParser.RULE_func_arg || ctx.getParent().getRuleIndex() == CalculatorParser.RULE_right_assignment){
//            //as argument
//            String funName = ctx.getChild(0).getText();
//            if(StandardFunctions.map.contains(funName)){
//                int argsNum = StandardFunctions.map.argsNum(funName);
//                Argument[] args = new Argument[argsNum];
//                for(int i =argsNum-1; i>=0;i--){
//
//                    args[i] = stack.pop();
//                }
//                var fun = new FunctionCallHeader(funName,args,variableRegister);
//                stack.push(fun);
//            }
//            else{
//                int argsNum=getVariablesTreeHeight(ctx.getChild(2));
//                Argument[] args = new Argument[argsNum];
//                for(int i =argsNum-1; i>=0;i--){
//
//                    args[i] = stack.pop();
//                }
//                var fun = new FunctionCallHeader(funName,args,variableRegister);
//                stack.push(fun);
//            }
//
//        }else if (ctx.getParent().getRuleIndex() == CalculatorParser.RULE_instruction){
//            String funName = ctx.getChild(0).getText();
//            if(StandardFunctions.map.contains(funName)){
//                int argsNum = StandardFunctions.map.argsNum(funName);
//                Argument[] args = new Argument[argsNum];
//                for(int i =argsNum-1; i>=0;i--){
//
//                    args[i] = stack.pop();
//                }
//                var fun = new FunctionCallHeader(funName,args,variableRegister);
//                instructionStack.push(fun);
//                if(ctx.getParent().getParent().getRuleIndex() == CalculatorParser.RULE_program_instruction){
//                    mainInstructionStackNum++;
//                }
//                if(!whileInstructionsCounter.empty()) whileInstructionsCounter.push(whileInstructionsCounter.pop()+1);
//            }else{
//                int argsNum = getVariablesTreeHeight(ctx.getChild(2));
//                Argument[] args = new Argument[argsNum];
//                for(int i =argsNum-1; i>=0;i--){
//                    args[i] = stack.pop();
//                }
//                var fun = new FunctionCallHeader(ctx.getChild(0).getText(),args,variableRegister);
//                instructionStack.push(fun);
//                if(ctx.getParent().getParent().getRuleIndex() == CalculatorParser.RULE_program_instruction){
//                    mainInstructionStackNum++;
//                }
//
//                if(!whileInstructionsCounter.empty()) {
//                    System.out.println(funName);
//                    whileInstructionsCounter.push(whileInstructionsCounter.pop()+1);
//                }
//
//            }
//
//        }
//
//    }
//
//    @Override
//    public void exitVariableStmt(EZPython4Parser.VariableStmtContext ctx) {
//        String leftName = ctx.VARIABLE_T().getText();
//        //System.out.println("ASS: " + ctx.variable().NAME().getText()+" "+ctx.variable().GLOBAL() + " " + b);
//        Assignment assignment = new Assignment(variableRegister,leftName,stack.pop());
//        if(ctx.parent.parent.getRuleIndex() == EZPython4Parser.RULE_expr) mainInstructionStackNum++;
//        if(!whileInstructionsCounter.empty()) whileInstructionsCounter.push(whileInstructionsCounter.pop()+1);
//        instructionStack.push(assignment);
//    }
//
//
//    @Override
//    public void exitFunction_body(CalculatorParser.Function_bodyContext ctx) {
//        if(!whileInstructionsCounter.empty()) return;
//        var funcBody = new FunctionBody();
//        while(instructionStack.size() > mainInstructionStackNum){
//            funcBody.instructions.add(0,instructionStack.pop());
//        }
//        int height = getVariablesTreeHeight(ctx.parent.getChild(4));
//        String[] names = new String[height];
//        if(height > 0 ){
//            ParseTree tree = ctx.parent.getChild(4);
//            for(int i=0; i<height-1;i++){
//                names[i]= tree.getChild(0).getText();
//                tree = tree.getChild(2);
//            }
//            names[height-1] = tree.getChild(0).getText();s
//        }
//        Where where = Where.empty();
//        if(!stack.isWhereEmpty()){
//            where = stack.popWhere();
//        }
//        System.out.println(currentFunctionName);
//        FunctionRegister.getInstance().putFunctionBody(new PredicateHeader(currentFunctionName,names),where,funcBody);
//
//    }
//
//    @Override public void enterWhileLoop(CalculatorParser.WhileLoopContext ctx) {
//        whileInstructionsCounter.push(0);
//    }

    @Override public void exitWhileStmt(EZPython4Parser.WhileStmtContext ctx) {

        var logicExpr = ctx.logicExpr();

        this.exitLogicExpr((EZPython4Parser.LogicExprContext)logicExpr.getRuleContext());
    }

//        @Override public void exitWhileLoop(CalculatorParser.WhileLoopContext ctx) {
//        //lastWhere = Where.empty();-
//
//        var funcBody = new FunctionBody();
//        int instructionNum = whileInstructionsCounterx.pop();
//        while(instructionNum > 0){
//            funcBody.instructions.add(0,instructionStack.pop());
//            instructionNum--;
//        }
//        Where where = Where.empty();
//        if(!logicExprStack.isWhereEmpty()){
//            where = logicExprStack.popWhere();
//        }
////
//        While whileLoop = new While(funcBody,where,variableRegister);
//        if(!whileInstructionsCounter.empty()){
//            whileInstructionsCounter.push(whileInstructionsCounter.pop()+1);
//        }
//        instructionStack.push(whileLoop);
//    }
//    @Override
//    public void enterFunction(CalculatorParser.FunctionContext ctx) {
//        //lastWhere = Where.empty();
//        currentFunctionName = ctx.getChild(2).getText();
//        int height = getVariablesTreeHeight(ctx.getChild(4));
//        String[] names = new String[height];
//        if(height > 0 ){
//            ParseTree tree = ctx.getChild(4);
//            for(int i=0; i<height-1;i++){
//                names[i]= tree.getChild(0).getText();
//                tree = tree.getChild(2);
//            }
//            names[height-1] = tree.getChild(0).getText();
//        }
//        var header = new PredicateHeader(currentFunctionName,names);
//        if(!FunctionRegister.getInstance().containsFunction(header.getName(),names.length)){
//            FunctionRegister.getInstance().putFunction(header);
//        }
//
//    }
//    private int getVariablesTreeHeight(ParseTree child){
//        if(child == null) return 0;
//        if(child.getChildCount()==3){
//            return  getVariablesTreeHeight(child.getChild(2)) + 1;
//        }  else if (child.getChildCount() >0){
//            return 1;
//        }else{
//            return 0;
//        }
//    }
//
//
//    @Override
//    public void exitFunction(CalculatorParser.FunctionContext ctx) { }
//
//
//    @Override
//    public void enterProgram_elements(CalculatorParser.Program_elementsContext ctx) {
//        super.enterProgram_elements(ctx);
//    }
//
//    @Override
//    public void exitProgram_elements(CalculatorParser.Program_elementsContext ctx) {
//        super.exitProgram_elements(ctx);
//    }
//
//    @Override
//    public void enterProgram_element(CalculatorParser.Program_elementContext ctx) {
//        super.enterProgram_element(ctx);
//    }
//
//    @Override
//    public void exitProgram_element(CalculatorParser.Program_elementContext ctx) {
//        super.exitProgram_element(ctx);
//    }
//
//    @Override
//    public void enterEveryRule(ParserRuleContext ctx) {
//
//        super.enterEveryRule(ctx);
//    }
//
//    @Override
//    public void exitEveryRule(ParserRuleContext ctx) {
//        super.exitEveryRule(ctx);
//    }
//
//    @Override
//    public void visitTerminal(TerminalNode node) {
//        super.visitTerminal(node);
//    }
//
//    @Override
//    public void visitErrorNode(ErrorNode node) {
//        super.visitErrorNode(node);
//    }
//
//    @Override public void enterPattern_matching(CalculatorParser.Pattern_matchingContext ctx) {
//
//    }
//
//    @Override public void exitPattern_matching(CalculatorParser.Pattern_matchingContext ctx) {
//        String logicOperationName = ctx.getChild(0).getText();
//        var arg2 = stack.pop();
//        var arg1 = stack.pop();
//        stack.pushWhere(new Where(Logic.map.getType(logicOperationName), arg1,arg2));
//
//    }
}
