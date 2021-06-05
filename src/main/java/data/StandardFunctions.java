package data;

import plotter.MatrixAggregator;
import plotter.Plotter;
import wrappers.StandardFunctionsMap;

import java.util.Set;

public class StandardFunctions {
    public static StandardFunctionsMap map = new StandardFunctionsMap();
    public static Plotter plotter = new MatrixAggregator();
    public static ComplexDouble add(ComplexDouble a, ComplexDouble b){
        return new ComplexDouble(a.realPart+b.realPart, a.imaginaryPart+b.imaginaryPart);
    }
    public static ComplexDouble sub(ComplexDouble a, ComplexDouble b){
        return  add(a, new ComplexDouble(-b.realPart,-b.imaginaryPart));
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
    public static ComplexDouble cos(ComplexDouble a){
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

    public static ComplexDouble abs(ComplexDouble a){
        return new ComplexDouble(Math.hypot(a.realPart,a.imaginaryPart),0.0);
    }
    public static ComplexDouble sqrt(ComplexDouble a){
        return new ComplexDouble(Math.sqrt(a.realPart),0.0);
    }

    public static ComplexDouble plot(ComplexDouble x, ComplexDouble y, ComplexDouble color) {
            plotter.plot(x.realPart.floatValue(),y.realPart.floatValue(), (color.realPart).intValue());
            return new ComplexDouble(x.getValue().realPart,y.getValue().realPart);
    }

    public static ComplexDouble print(String str, ComplexDouble val) {
            System.out.println("Print: " + str + " = "+val);
            return ComplexDouble.zero();
    }
    public static ComplexDouble step(){
        return plotter.getStep();
    }
    public static ComplexDouble setup(ComplexDouble size, ComplexDouble min, ComplexDouble max){
        plotter.setup(size.realPart.intValue(),min.realPart,max.realPart);
        return ComplexDouble.zero();
    }
}
