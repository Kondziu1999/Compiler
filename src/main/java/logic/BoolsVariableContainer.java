package logic;

import java.util.HashMap;

public class BoolsVariableContainer {
    private HashMap<String, Boolean> variables = new HashMap<>();

    public boolean containsVariable(String name){
        return variables.containsKey(name);
    }

    public void setVariable(BoolVariable boolVariable){
        if (variables.containsKey(boolVariable.name)){
            variables.replace(boolVariable.name,boolVariable.value);
            return;
        }

        variables.put(boolVariable.name, boolVariable.value);
    }

    public Boolean getValue(String varName){
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        }
        
        return null;
    }
}