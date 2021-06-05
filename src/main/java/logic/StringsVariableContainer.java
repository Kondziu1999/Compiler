package logic;

public class StringsVariableContainer {
    private HashMap<String, String> variables;

    public boolean containsVariable(String name){
        return variables.containsKey(name);
    }

    public void setVariable(StringVariable stringVariable){
        if (variables.containsKey(stringVariable.name)){
            variables[stringVariable.name] = stringVariable.value;
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