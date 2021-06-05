package data;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;

public class FunctionRegister {
    private HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>> map = new HashMap<PredicateHeader, ArrayList<Pair<Where,FunctionBody>>>();
    public static FunctionRegister getInstance(){
        if(_instance == null){
            _instance = new FunctionRegister();
        }
        return _instance;
    }
    private static FunctionRegister _instance;
    private FunctionRegister(){}
    public boolean containsFunction(String functionName, int argsNumber){
        return map.containsKey(new PredicateHeader(functionName,new String[argsNumber]));
    }
    public FunctionBody getFunctionBody(FunctionCallHeader header, VariableRegister register){
        PredicateHeader predicateHeader = new PredicateHeader(header.funcName,new String[header.args.length]);
        var funcBodyList = map.get(predicateHeader);
        for(var pair : funcBodyList){
            var where = pair.getKey();
            where.setRegister(register);
            if(where.evaluate()){
                return pair.getValue();
            }
        }
        return null;
    }
    public String[] getFunctionHeader(String funName, int argsNum){
        var set = map.keySet();
        for(var predicateHeader : set){
            if(predicateHeader.equals(new PredicateHeader(funName,new String[argsNum])))
                return predicateHeader.getInputs();
        }
        return new String[0];
    }
    public void putFunctionBody(PredicateHeader header, Where where, FunctionBody body){
        map.get(header).add(new Pair<>(where,body));
    }
    public void putFunction(PredicateHeader header){
        map.put(header,new ArrayList<Pair<Where,FunctionBody>>());
    }
}
