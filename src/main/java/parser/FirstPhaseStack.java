package parser;

import data.*;

import java.util.Stack;

public class FirstPhaseStack {

    private Stack<ComplexDouble> numberStack = new Stack<>();
    private Stack<String> variableStack = new Stack<>();
    private Stack<FunctionCallHeader> functionStack = new Stack<>();
    private Stack<Instruction> instructionStack = new Stack<>();
    private Stack<Where> whereStack = new Stack<Where>();
    private Stack<Argument> argumentStack = new Stack<>();

    public Argument pop(){
        return argumentStack.pop();
    }
    public Where popWhere(){
        return whereStack.pop();
    }
    public void pushWhere(Where where){
        whereStack.push(where);
    }
    public void push(Argument argument){
        argumentStack.push(argument);
    }
    public boolean isWhereEmpty(){
        return whereStack.empty();
    }
    public boolean isArgumentEmpty(){
        return argumentStack.empty();
    }
}