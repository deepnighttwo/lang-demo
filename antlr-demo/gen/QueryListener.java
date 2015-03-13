// Generated from D:/mymise/antlr-demo/src/main/java/sql\Query.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link QueryParser}.
 */
public interface QueryListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(@NotNull QueryParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(@NotNull QueryParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull QueryParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull QueryParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#colname}.
	 * @param ctx the parse tree
	 */
	void enterColname(@NotNull QueryParser.ColnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#colname}.
	 * @param ctx the parse tree
	 */
	void exitColname(@NotNull QueryParser.ColnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link QueryParser#tablename}.
	 * @param ctx the parse tree
	 */
	void enterTablename(@NotNull QueryParser.TablenameContext ctx);
	/**
	 * Exit a parse tree produced by {@link QueryParser#tablename}.
	 * @param ctx the parse tree
	 */
	void exitTablename(@NotNull QueryParser.TablenameContext ctx);
}