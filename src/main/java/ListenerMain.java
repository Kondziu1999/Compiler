
import logic.ErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.EZPython4ListenerImpl;
import parser.EZPython4Lexer;
import parser.EZPython4Parser;

import java.io.*;

public class ListenerMain {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        FileInputStream fis = null;
        try {
            // Open the input file stream
            fis = new FileInputStream(file);

            // Creat    e a CharStream that reads from standard input
            ANTLRInputStream input = new ANTLRInputStream(fis);

            // Create a lexer that feeds off of input CharStream
            EZPython4Lexer lexer = new EZPython4Lexer(input);

            // Create a buffer of tokens pulled from the lexer
            CommonTokenStream tokens = new CommonTokenStream(lexer);

            // Create a parser that feeds off the tokens buffer
            EZPython4Parser parser = new EZPython4Parser(tokens);

            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());
            // Begin parsing at rule prog
            ParseTree tree = parser.program();

            // Close the input file
            fis.close();
            if(! ErrorListener.executeCode){
                return;
            }
            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            var listener = new EZPython4ListenerImpl();

            walker.walk(listener, tree);



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}