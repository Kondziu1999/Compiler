import data.StandardFunctions;
import logic.ErrorListener;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import parser.CalculationListener;
//import parser.CalculatorLexer;
//import parser.CalculatorParser;
import parser.EZPython4Lexer;
import parser.EZPython4Parser;
import plotter.MatrixAggregator;

import java.io.*;

public class ListenerMain {
    public static void main(String[] args) throws IOException {
        //String fileName = "Brod.hl";
        String fileName = "ProgTest.ezpy";
        // String fileName = "circles.hl";
        String filePath = "C:\\Users\\Jutro_masz_kolosa\\Desktop\\Kominatoryka\\KompilkiSimple\\Kompilatory-main\\src\\main\\java\\parser\\" + fileName;
        File file = new File(filePath);
        FileInputStream fis = null;
        MatrixAggregator aggregator = new MatrixAggregator();
        StandardFunctions.plotter = aggregator;
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
            var listener = new CalculationListener(aggregator);

            walker.walk(listener, tree);


            listener.ListInstructionsStack();
            System.out.println("RUNNING.....................");
            if(listener.CheckInstructionStack()){
                listener.RunStack();
                //aggregator.print();
                //aggregator.toFile("output");

                aggregator.toImage();
                System.out.println("Global Register:");

            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}