package logic;

import org.antlr.v4.runtime.tree.ParseTree;
import parser.EZPython4Parser;

import javax.swing.text.html.Option;
import java.util.Optional;

public class Print {
    String stringText;
    String variableText;

    public Print(EZPython4Parser.PrintFuncContext printCtx){
        this.stringText = printCtx.STRING_T() != null ? printCtx.STRING_T().getText() : "";
        this.variableText = printCtx.VARIABLE_T() != null ? printCtx.VARIABLE_T().getText() : "";
    }


    public void evaluate(){
        var textToPrint = "";
        if(stringText != null) {
            textToPrint += this.stringText;
        }
        var numberVarible = NumbersVariableContainer.getValue(variableText);
        if(numberVarible != null){
            textToPrint += numberVarible.toString();
        }
        else {
            var boolVarible = BoolsVariableContainer.getValue(variableText);
            if (boolVarible != null) {
                textToPrint += boolVarible.toString();
            } else {
                var stringVarible = StringsVariableContainer.getValue(variableText);
                if (stringVarible != null) {
                    textToPrint += stringVarible;
                }
            }
        }
        System.out.println(textToPrint.replaceAll("\"",""));
    }

}
