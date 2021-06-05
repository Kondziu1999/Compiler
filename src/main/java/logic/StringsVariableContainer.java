package logic;

import java.util.HashMap;

public class StringsVariableContainer {
    private HashMap<String, String> variables = new HashMap<>();

    public boolean containsVariable(String name){
        return variables.containsKey(name);
    }

    public void setVariable(StringVariable stringVariable){
        if (variables.containsKey(stringVariable.name)){
            variables.replace(stringVariable.name, stringVariable.value);
            return;
        }

        variables.put(stringVariable.name, stringVariable.value);
    }

    public String getValue(String varName){
        if (variables.containsKey(varName)) {
            return variables.get(varName);
        }
        
        return null;
    }
}