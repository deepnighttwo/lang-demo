package sql;

import org.antlr.v4.runtime.misc.NotNull;

/**
 * User: Mark Zang
 * Date: 2015/3/16
 * Time: 21:13
 */
public class JsonSelectVisitor<T> extends QueryBaseVisitor {



    @Override public T visitQuery(@NotNull QueryParser.QueryContext ctx) {
        visitChildren(ctx);
        return null;
    }


    @Override
    public T visitColname(@NotNull QueryParser.ColnameContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }

    /**
     * {@inheritDoc}
     * <p/>
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     */
    @Override
    public T visitTablename(@NotNull QueryParser.TablenameContext ctx) {
        System.out.println(ctx.getText());
        return null;
    }


}
