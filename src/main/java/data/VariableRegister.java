package data;

import java.util.HashMap;

public class VariableRegister {
    private HashMap<String,ComplexDouble> map;
    private VariableRegister parentRegister;

    public VariableRegister(){
        map = new HashMap<String,ComplexDouble>();
        parentRegister = null;
    }
    public VariableRegister(VariableRegister parent){
        map = new HashMap<String,ComplexDouble>();
        parentRegister = parent;
    }
    public boolean containsVariable(String name){
        return map.containsKey(name) || parentRegister.containsVariable(name);
    }
    public void putVariable(String name, ComplexDouble value){
        map.put(name,value);
    }
    public void setVariable(String name, ComplexDouble value){
        if(map.containsKey(name)){
            map.put(name,value);
        }
        else if(parentRegister != null && parentRegister.containsVariable(name)){
            parentRegister.setVariable(name,value);
        } else {
            map.put(name,value);
        }
    }
    public ComplexDouble getValue(String varName){
        if(map.containsKey(varName))
            return map.get(varName);
        else{
            return parentRegister.getValue(varName);
        }

    }
    public VariableRegister getParentRegister(){
        return parentRegister;
    }
}
