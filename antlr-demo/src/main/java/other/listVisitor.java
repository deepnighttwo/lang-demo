package other;// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/other\list.g4 by ANTLR 4.5

    import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link other.listParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface listVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link other.listParser#list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList(@NotNull listParser.ListContext ctx);
	/**
	 * Visit a parse tree produced by {@link other.listParser#elems}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElems(@NotNull listParser.ElemsContext ctx);
	/**
	 * Visit a parse tree produced by {@link other.listParser#elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElem(@NotNull listParser.ElemContext ctx);
}