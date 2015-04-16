package otl;

import com.deepnighttwo.otl.grammar.gen.OTLBaseVisitor;
import com.deepnighttwo.otl.grammar.gen.OTLLexer;
import com.deepnighttwo.otl.grammar.gen.OTLParser;
import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Mark Zang
 * Date: 2015/4/16
 * Time: 15:22
 */
public class JSONOTLVisitor extends OTLBaseVisitor<Object> {


    @Override
    public Object visitFrom(@NotNull OTLParser.FromContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public Object visitPropsSel(@NotNull OTLParser.PropsSelContext ctx) {
        return super.visitPropsSel(ctx);
    }

    @Override
    public Object visitFloatVar(@NotNull OTLParser.FloatVarContext ctx) {
        return super.visitFloatVar(ctx);
    }

    @Override
    public Object visitNullVar(@NotNull OTLParser.NullVarContext ctx) {
        return super.visitNullVar(ctx);
    }

    @Override
    public Object visitCharVar(@NotNull OTLParser.CharVarContext ctx) {
        return super.visitCharVar(ctx);
    }

    @Override
    public Object visitFuncVar(@NotNull OTLParser.FuncVarContext ctx) {
        return super.visitFuncVar(ctx);
    }

    @Override
    public Object visitMulDiv(@NotNull OTLParser.MulDivContext ctx) {
        return super.visitMulDiv(ctx);
    }

    @Override
    public Object visitAddSub(@NotNull OTLParser.AddSubContext ctx) {
        return super.visitAddSub(ctx);
    }

    @Override
    public Object visitParens(@NotNull OTLParser.ParensContext ctx) {
        return super.visitParens(ctx);
    }

    @Override
    public Object visitDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx) {
        return super.visitDirectPropVar(ctx);
    }

    @Override
    public Object visitIntVar(@NotNull OTLParser.IntVarContext ctx) {
        return super.visitIntVar(ctx);
    }

    @Override
    public Object visitBooleanVar(@NotNull OTLParser.BooleanVarContext ctx) {
        return super.visitBooleanVar(ctx);
    }

    @Override
    public Object visitStringVar(@NotNull OTLParser.StringVarContext ctx) {
        return super.visitStringVar(ctx);
    }

    @Override
    public Object visitPropFullName(@NotNull OTLParser.PropFullNameContext ctx) {
        return super.visitPropFullName(ctx);
    }

    @Override
    public Object visitProp(@NotNull OTLParser.PropContext ctx) {
        return super.visitProp(ctx);
    }

    @Override
    public Object visitArrayProp(@NotNull OTLParser.ArrayPropContext ctx) {
        return super.visitArrayProp(ctx);
    }

    @Override
    public Object visitBoolExprs(@NotNull OTLParser.BoolExprsContext ctx) {
        return super.visitBoolExprs(ctx);
    }

    @Override
    public Object visitIntegerLiteral(@NotNull OTLParser.IntegerLiteralContext ctx) {
        return Integer.parseInt(ctx.getText());
    }


    @Override
    public Object visitFalseBool(@NotNull OTLParser.FalseBoolContext ctx) {
        return Boolean.FALSE;
    }

    @Override
    public Object visitTrueBool(@NotNull OTLParser.TrueBoolContext ctx) {
        return Boolean.TRUE;
    }

    @Override
    public Object visitNotBool(@NotNull OTLParser.NotBoolContext ctx) {
        return !(Boolean) this.visit(ctx.boolExpr());
    }

    @Override
    public Object visitExprBool(@NotNull OTLParser.ExprBoolContext ctx) {
        Boolean var1 = (Boolean) this.visit(ctx.boolExpr(0));

        Boolean var2 = (Boolean) this.visit(ctx.boolExpr(1));

        int type = ctx.boolOprt.getType();
        switch (type) {
            case OTLLexer.AND:
                return var1 && var2;
            case OTLLexer.OR:
                return var1 || var2;
            default:
                throw new RuntimeException("Unsupported operation " + ctx.boolOprt.getText());
        }
    }

    @Override
    public Object visitParenBool(@NotNull OTLParser.ParenBoolContext ctx) {
        return this.visit(ctx.boolExpr());
    }

    @Override
    public Object visitCompareBool(@NotNull OTLParser.CompareBoolContext ctx) {

        Comparable var1 = (Comparable) this.visit(ctx.propVar(0));

        Comparable var2 = (Comparable) this.visit(ctx.propVar(1));

        int type = ctx.compareOpr.getType();
        switch (type) {
            case OTLLexer.SMALLER:
                return var1.compareTo(var2) < 0;
            case OTLLexer.SMALLEROREQ:
                return var1.compareTo(var2) <= 0;
            case OTLLexer.EQUALS:
                return var1.compareTo(var2) == 0;
            case OTLLexer.NOTEQUAL:
                return var1.compareTo(var2) != 0;
            case OTLLexer.BIGGER:
                return var1.compareTo(var2) > 0;
            case OTLLexer.BIGGEROREQ:
                return var1.compareTo(var2) >= 0;
            default:
                throw new RuntimeException("Unsupported operation " + ctx.compareOpr.getText());
        }
    }
}
