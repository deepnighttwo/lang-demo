package jg4;

import antlr4gen.JavaBaseListener;
import antlr4gen.JavaParser;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: mzang
 * Date: 2015-03-27
 * Time: 15:43
 */
public class IntfListener extends JavaBaseListener {

    JavaParser javaParser;

    public IntfListener(JavaParser javaParser) {
        this.javaParser = javaParser;
    }

    @Override
    public void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        System.out.println("interface I" + ctx.Identifier().getText());
    }

    @Override
    public void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        System.out.println("}");
    }

    @Override
    public void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {
        TokenStream tokens = javaParser.getTokenStream();
        String retType = "void";
        if (ctx.type() != null) {
            retType = ctx.type().getText();//tokens.getText(ctx.type());
        }
        String args = tokens.getText(ctx.formalParameters());
        System.out.println("\t" + retType + " " + ctx.Identifier().getText() + args + ";");
    }
}
