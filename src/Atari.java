import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.FileInputStream;
import java.io.InputStream;

public class Atari {
    public static void main(String[] args) throws Exception {
        String inputFile = "tests/se.txt";
        if ( args.length>0 )
            inputFile = args[0];
        InputStream is = System.in;
        if ( inputFile!=null )
            is = new FileInputStream(inputFile);
        CharStream input = CharStreams.fromStream(is);
        AtariLexer lexer = new AtariLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        AtariParser parser = new AtariParser(tokens);
    
        ParseTree cst = parser.prog(); // parse

        Program ast = new CstVisitor().visit(cst);
        ast.run();

    }
}
