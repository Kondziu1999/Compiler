package logic;

import org.antlr.v4.runtime.*;

import java.util.Collections;
import java.util.List;

public class ErrorListener extends BaseErrorListener {

    public static boolean executeCode = true;

    @Override
    public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e) {
        if(!executeCode)
            return;

        List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
        Collections.reverse(stack);
        System.err.print("Error occured: ");
        System.err.println("token " + "\"" + ((Token) offendingSymbol).getText() + "\""
                +
                " (line " + line + ", column " + (charPositionInLine + 1) + ")"
        );
        executeCode = false;
    }
}
