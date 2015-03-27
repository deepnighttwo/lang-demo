package learn;

import antlrv4gen.LibExprLexer;
import antlrv4gen.LibExprParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * User: mzang
 * Date: 2015-03-27
 * Time: 14:42
 */
public class CalculatorAppMain {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        CalcVisitor visitor = new CalcVisitor();
        while (true) {
            String line = br.readLine()+"\r\n";
            ANTLRInputStream in = new ANTLRInputStream(new ByteArrayInputStream(line.getBytes()));
            LibExprLexer lexer = new LibExprLexer(in);
            CommonTokenStream tokenStream = new CommonTokenStream(lexer);
            LibExprParser parser = new LibExprParser(tokenStream);

            visitor.visit(parser.prog());
        }
    }
}
