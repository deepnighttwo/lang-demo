package learn;

import antlrv4gen.LibExprBaseVisitor;
import antlrv4gen.LibExprParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.HashMap;
import java.util.Map;

/**
 * User: mzang
 * Date: 2015-03-27
 * Time: 14:43
 */
public class CalcVisitor extends LibExprBaseVisitor<Integer> {

    Map<String, Integer> vars = new HashMap<>();


    @Override
    public Integer visitProg(@NotNull LibExprParser.ProgContext ctx) {
        return super.visitProg(ctx);
    }

    @Override
    public Integer visitPrintExpr(@NotNull LibExprParser.PrintExprContext ctx) {
        int var = visit(ctx.expr());
        System.out.println(ctx.getText() + "=" + var);
        return var;
    }

    @Override
    public Integer visitAssign(@NotNull LibExprParser.AssignContext ctx) {
        String varName = ctx.ID().getText();
        int var = visit(ctx.expr());
        vars.put(varName, var);
        System.out.println(vars);
        return var;
    }

    @Override
    public Integer visitBlank(@NotNull LibExprParser.BlankContext ctx) {
        return super.visitBlank(ctx);
    }

    @Override
    public Integer visitMulDiv(@NotNull LibExprParser.MulDivContext ctx) {

        System.out.println(ctx);
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if (ctx.op.getType() == LibExprParser.MUL) {
            return left * right;
        } else {
            return left / right;
        }
    }

    @Override
    public Integer visitAddSub(@NotNull LibExprParser.AddSubContext ctx) {
        int left = visit(ctx.expr(0));
        int right = visit(ctx.expr(1));

        if (ctx.op.getType() == LibExprParser.ADD) {
            return left + right;
        } else {
            return left - right;
        }
    }

    @Override
    public Integer visitId(@NotNull LibExprParser.IdContext ctx) {
        return vars.get(ctx.ID().getText());
    }

    @Override
    public Integer visitInt(@NotNull LibExprParser.IntContext ctx) {
        return Integer.valueOf(ctx.INT().getText());
    }

    @Override
    public Integer visitParens(@NotNull LibExprParser.ParensContext ctx) {
        return visit(ctx.expr());
    }
}
