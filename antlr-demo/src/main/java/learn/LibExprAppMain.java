package learn;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * User: Mark Zang
 * Date: 2015/3/24
 * Time: 19:47
 */
public class LibExprAppMain {
    public static void main(String[] args) throws IOException {
        InputStream input = new ByteArrayInputStream("1+9*(5+99)\n".getBytes());
        ANTLRInputStream antlrInputStream = new ANTLRInputStream(input);
        LibExprLexer libExprLexer = new LibExprLexer(antlrInputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(libExprLexer);
        LibExprParser parser = new LibExprParser(tokenStream);
        ParseTree prog = parser.prog();

        System.out.println(prog.toStringTree(parser));

    }
}
