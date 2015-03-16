package sql;

/**
 * User: mzang
 * Date: 2015-03-11
 * Time: 11:28
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Test {
    public static void main(String[] args) throws Exception {
        // create a CharStream that reads from standard input

        InputStream is = new ByteArrayInputStream("select a.b.c.asdf,two ,three.ggg from sourcetable".getBytes());

        ANTLRInputStream input = new ANTLRInputStream(is);

        // create a lexer that feeds off of input CharStream
        QueryLexer lexer = new QueryLexer(input);


        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        QueryParser parser = new QueryParser(tokens);

        ParseTree tree = parser.query(); // begin parsing at init rule

        JsonSelectVisitor visitor = new JsonSelectVisitor();
        visitor.visit(tree);

        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}
