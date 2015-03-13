package sql;

/**
 * User: mzang
 * Date: 2015-03-11
 * Time: 11:28
 */
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class Test {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input

        InputStream is = new ByteArrayInputStream("select one,two ,three from table".getBytes());

        ANTLRInputStream input = new ANTLRInputStream(is);

        // create a lexer that feeds off of input CharStream
        QueryLexer lexer = new QueryLexer(input);


        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        QueryParser parser = new QueryParser(tokens);

        ParseTree tree = parser.query(); // begin parsing at init rule


        ParseTree c = tree.getChild(0);

        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}
