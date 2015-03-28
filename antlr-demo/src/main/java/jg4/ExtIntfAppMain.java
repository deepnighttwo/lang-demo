package jg4;

import antlr4gen.JavaLexer;
import antlr4gen.JavaParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.IOException;

/**
 * User: Mark Zang
 * Date: 2015/3/28
 * Time: 19:46
 */
public class ExtIntfAppMain {
    public static void main(String[] args) throws IOException {
        CharStream charStream = new ANTLRInputStream(ExtIntfAppMain.class.getClassLoader().getResourceAsStream("Demo.java"));
        JavaLexer lexer = new JavaLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        JavaParser parser = new JavaParser(tokens);
        ParseTree tree = parser.compilationUnit(); // parse

        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        IntfListener extractor = new IntfListener(parser);
        walker.walk(extractor, tree); // initiate walk of tree with listener
    }
}
