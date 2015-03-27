package jg4;

import antlr4gen.JavaBaseListener;
import antlr4gen.JavaParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: mzang
 * Date: 2015-03-27
 * Time: 15:43
 */
public class IntfListener extends JavaBaseListener {

    JavaParser javaParser;

    public IntfListener (JavaParser javaParser){
        this.javaParser = javaParser;
    }

    @Override
    public void enterClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        System.out.println("interface I"+ctx.Identifier().getText());
    }

    @Override
    public void exitClassDeclaration(@NotNull JavaParser.ClassDeclarationContext ctx) {
        super.exitClassDeclaration(ctx);
    }

    @Override
    public void enterMethodDeclaration(@NotNull JavaParser.MethodDeclarationContext ctx) {
        super.enterMethodDeclaration(ctx);
    }
}
