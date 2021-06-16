
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
            fis = new FileInputStream(file);
            ANTLRInputStream input = new ANTLRInputStream(fis);
            EZPython4Lexer lexer = new EZPython4Lexer(input);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            EZPython4Parser parser = new EZPython4Parser(tokens);
            parser.removeErrorListeners();
            parser.addErrorListener(new ErrorListener());
            ParseTree tree = parser.program();
            fis.close();
            if(! ErrorListener.executeCode){
                return;
            }
            ParseTreeWalker walker = new ParseTreeWalker();
            var listener = new EZPython4ListenerImpl();

            walker.walk(listener, tree);


        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}