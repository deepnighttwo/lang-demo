package other;// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/other\list.g4 by ANTLR 4.5

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link listParser}.
 */
public interface listListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link listParser#list}.
	 * @param ctx the parse tree
	 */
	void enterList(@NotNull listParser.ListContext ctx);
	/**
	 * Exit a parse tree produced by {@link listParser#list}.
	 * @param ctx the parse tree
	 */
	void exitList(@NotNull listParser.ListContext ctx);
	/**
	 * Enter a parse tree produced by {@link listParser#elems}.
	 * @param ctx the parse tree
	 */
	void enterElems(@NotNull listParser.ElemsContext ctx);
	/**
	 * Exit a parse tree produced by {@link listParser#elems}.
	 * @param ctx the parse tree
	 */
	void exitElems(@NotNull listParser.ElemsContext ctx);
	/**
	 * Enter a parse tree produced by {@link listParser#elem}.
	 * @param ctx the parse tree
	 */
	void enterElem(@NotNull listParser.ElemContext ctx);
	/**
	 * Exit a parse tree produced by {@link listParser#elem}.
	 * @param ctx the parse tree
	 */
	void exitElem(@NotNull listParser.ElemContext ctx);
}