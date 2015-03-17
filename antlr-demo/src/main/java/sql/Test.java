package sql;

/**
 * User: mzang
 * Date: 2015-03-11
 * Time: 11:28
 */

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import sql.QueryParser.ColnameContext;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

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

        System.out.println(tree.getChildCount());

        ParseTree sel = tree.getChild(0) ;

        for (int i = 0; i < sel.getChildCount(); i++) {
            ParseTree p = sel.getChild(i);
            if(p instanceof ColnameContext){
                ColnameContext context = (ColnameContext)p;
                System.out.println();
            }
//            System.out.println(context.getClass().toString());
        }



        System.out.println(tree.toStringTree(parser)); // print LISP-style tree

    }
}
