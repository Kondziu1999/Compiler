using System;
using System.IO;
using Antlr4.Runtime;

namespace CsCompiler
{
    class Program
    {
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");


            
            using (var fileStream = new StreamReader("grammar.g4"))
            {
                var inputStream = new AntlrInputStream(fileStream);

                SearchLexer lexer = new SearchLexer(inputStream);
                CommonTokenStream commonTokenStream = new CommonTokenStream(lexer);
                SearchParser parser = new SearchParser(commonTokenStream);

                parser.RemoveErrorListeners();
                parser.AddErrorListener(new ErrorListener()); // add ours

                parser.root();
            }
        }
    }
}
