package logic;

import java.util.HashMap;

public class NumbersVariableContainer {
    private static HashMap<String, Double> variables = new HashMap<>();

    public static boolean containsVariable(String name){
        return variables.containsKey(name);
    }

    public static void setVariable(NumberVariable numberVariable){
        if (variables.containsKey(numberVariable.name)){
            variables.replace(numberVariable.name,numberVariable.value);
            return;
        }

        variables.put(numberVariable.name, numberVariable.value);
    }

    public static Double getValue(String varName){
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        }
        
        return null;
    }
}