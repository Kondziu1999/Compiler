package data;

import java.util.HashMap;
import java.util.Objects;

public class ComplexDouble implements Argument{
    public Double realPart;
    public Double imaginaryPart;

    public ComplexDouble(Double realPart, Double imaginaryPart) {
        this.realPart = realPart;
        this.imaginaryPart = imaginaryPart;
    }

    public static ComplexDouble one() {
        return new ComplexDouble(1.0,0.0);
    }
    public static ComplexDouble zero() {
        return new ComplexDouble(0.0,0.0);
    }
    public static ComplexDouble i() {
        return new ComplexDouble(0.0,1.0);
    }

    public static ComplexDouble add(ComplexDouble a, ComplexDouble b){
        return new ComplexDouble(a.realPart+b.realPart, a.imaginaryPart+b.imaginaryPart);
    }
    public static ComplexDouble sub(ComplexDouble a, ComplexDouble b){
        b.imaginaryPart *= -1;
        b.realPart *= -1;
        return  add(a, b);
    }
    public static ComplexDouble mul(ComplexDouble a, ComplexDouble b){
        ComplexDouble result;
        result = new ComplexDouble(a.realPart, a.imaginaryPart);
        result.realPart = a.realPart * b.realPart - a.imaginaryPart * b.imaginaryPart;
        result.imaginaryPart = a.realPart * b.imaginaryPart + a.imaginaryPart * b.realPart;
        return result;
    }
    public static ComplexDouble div(ComplexDouble a, ComplexDouble b){
        ComplexDouble result;
        result = new ComplexDouble(a.realPart, a.imaginaryPart);
        Double denominator = b.realPart * b.realPart + b.imaginaryPart * b.imaginaryPart;
        result.realPart = (a.realPart*b.realPart+a.imaginaryPart*b.imaginaryPart) / denominator;
        result.imaginaryPart = (a.imaginaryPart*b.realPart-a.realPart*b.imaginaryPart) /denominator;

        return result;
    }
    public static ComplexDouble mod(ComplexDouble a, ComplexDouble b){
        return new ComplexDouble(a.realPart % b.realPart, 0.0);
    }
    public static ComplexDouble sin(ComplexDouble a){
        return new ComplexDouble(Math.sin(a.realPart),0.0);
    }
    public static  ComplexDouble cos(ComplexDouble a){
        return new ComplexDouble(Math.cos(a.realPart),0.0);
    }
    public static ComplexDouble tan(ComplexDouble a){
        return new ComplexDouble(Math.tan(a.realPart),0.0);
    }
    public static ComplexDouble Re(ComplexDouble a){
        return new ComplexDouble(a.realPart,0.0);
    }
    public static ComplexDouble Im(ComplexDouble a){
        return new ComplexDouble(a.imaginaryPart,0.0);
    }
    @Override
    public String toString() {
        return
                "" + realPart + "+" + imaginaryPart + "i";// +
                //" + " + imaginaryPart +
                //"i";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexDouble that = (ComplexDouble) o;
        return Objects.equals(realPart, that.realPart) &&
                Objects.equals(imaginaryPart, that.imaginaryPart);
    }

    @Override
    public int hashCode() {
        return Objects.hash(realPart, imaginaryPart);
    }

    @Override
    public ComplexDouble getValue() {
        return new ComplexDouble(realPart,imaginaryPart);
    }

    @Override
    public void setRegister(VariableRegister register) {

    }

    @Override
    public boolean isValid() {
        return true;
    }
}
