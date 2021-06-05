package data;

public class While extends Instruction{

    private FunctionBody fbody;
    private Where condition;

    public While(FunctionBody fbody,Where condition, VariableRegister register){
        super(register);
        this.fbody=fbody;
        this.condition =condition;
    }
    @Override
    public ComplexDouble Do(){
        var returnValue = ComplexDouble.zero();
        condition.setRegister(register);
        while (condition.evaluate()){
            for (var ins: fbody.instructions) {
                ins.setRegister(register);
                returnValue = ins.Do();
            }
        }
        return returnValue;
    }

    @Override
    public boolean check() {
        return true;
    }

    public String toString(){
        return "while(" + condition.toString() + ")" +fbody.toString();
    }
}
