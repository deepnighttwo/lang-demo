package otl;

import com.deepnighttwo.otl.grammar.gen.OTLBaseVisitor;
import com.deepnighttwo.otl.grammar.gen.OTLLexer;
import com.deepnighttwo.otl.grammar.gen.OTLParser;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/16
 * Time: 15:22
 */
public class JSONOTLVisitor extends OTLBaseVisitor<Object> {

    private Object rawData;

    private Object currData;

    private Map result;

    public JSONOTLVisitor(Object rawData) {
        this.rawData = rawData;
    }

    public JSONOTLVisitor() {
    }

    public Object getRawData() {
        return rawData;
    }

    public void setRawData(Object rawData) {
        this.rawData = rawData;
    }

    @Override
    public Object visitSelect(@NotNull OTLParser.SelectContext ctx) {
        result = new LinkedHashMap();
        super.visitSelect(ctx);
        System.out.println(result);
        return null;
    }

    @Override
    public Object visitFrom(@NotNull OTLParser.FromContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public Object visitPropsSel(@NotNull OTLParser.PropsSelContext ctx) {

        currData = rawData;

        String alias = ctx.ID() == null ? "default name" : ctx.ID().getText();
        Object var = visit(ctx.propVar());

        result.put(alias, var);
        return var;
    }

    @Override
    public Object visitFloatVar(@NotNull OTLParser.FloatVarContext ctx) {
        return Double.valueOf(ctx.getText());
    }

    @Override
    public Object visitNullVar(@NotNull OTLParser.NullVarContext ctx) {
        return null;
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
        double var1 = (double) (visit(ctx.propVar(0)));
        double var2 = (double) (visit(ctx.propVar(1)));

        if (ctx.op.getType() == OTLLexer.MUL) {
            return var1 * var2;
        } else {
            return var1 / var2;
        }
    }

    @Override
    public Object visitAddSub(@NotNull OTLParser.AddSubContext ctx) {
        double var1 = (double) (visit(ctx.propVar(0)));
        double var2 = (double) (visit(ctx.propVar(1)));

        if (ctx.op.getType() == OTLLexer.ADD) {
            return var1 + var2;
        } else {
            return var1 - var2;
        }
    }

    @Override
    public Object visitParens(@NotNull OTLParser.ParensContext ctx) {
        return visit(ctx.propVar());
    }

    @Override
    public Object visitDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx) {
        return visit(ctx.propFullName());
    }

    @Override
    public Object visitIntVar(@NotNull OTLParser.IntVarContext ctx) {
        return Integer.parseInt(ctx.getText());
    }

    @Override
    public Object visitBooleanVar(@NotNull OTLParser.BooleanVarContext ctx) {
        return visit(ctx.booleanLiteral());
    }

    @Override
    public Object visitStringVar(@NotNull OTLParser.StringVarContext ctx) {
        return ctx.StringLiteral().getText();
    }

    @Override
    public Object visitPropFullName(@NotNull OTLParser.PropFullNameContext ctx) {
        List<OTLParser.PropNameContext> propNameContexts = ctx.propName();

        Object ret = null;
        for (OTLParser.PropNameContext propNameContext : propNameContexts) {
            ret = visit(propNameContext);
        }
        return ret;
    }

    @Override
    public Object visitPropName(@NotNull OTLParser.PropNameContext ctx) {
        List<OTLParser.IntegerLiteralContext> indexCtxs = ctx.integerLiteral();
        String propName = ctx.ID().getText();
        Object ret = ((Map) currData).get(propName);
        currData = ret;
        if (indexCtxs == null || indexCtxs.isEmpty()) {
            return ret;
        } else {
            for (OTLParser.IntegerLiteralContext indexCtx : indexCtxs) {
                Integer index = (Integer) visit(indexCtx);
                currData = ((List) currData).get(index);
            }
            return currData;
        }
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
        return !((Boolean) this.visit(ctx.boolExpr()));
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
