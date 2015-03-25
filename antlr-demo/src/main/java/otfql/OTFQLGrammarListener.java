package otfql;// Generated from D:/mymise/lang-demo/antlr-demo/src/main/java/otfql\OTFQLGrammar.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OTFQLGrammarParser}.
 */
public interface OTFQLGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 */
	void enterQl(@NotNull OTFQLGrammarParser.QlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#ql}.
	 * @param ctx the parse tree
	 */
	void exitQl(@NotNull OTFQLGrammarParser.QlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull OTFQLGrammarParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull OTFQLGrammarParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull OTFQLGrammarParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull OTFQLGrammarParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull OTFQLGrammarParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void enterPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void exitPropsSel(@NotNull OTFQLGrammarParser.PropsSelContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void enterPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void exitPropFullName(@NotNull OTFQLGrammarParser.PropFullNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(@NotNull OTFQLGrammarParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(@NotNull OTFQLGrammarParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void enterTest(@NotNull OTFQLGrammarParser.TestContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#test}.
	 * @param ctx the parse tree
	 */
	void exitTest(@NotNull OTFQLGrammarParser.TestContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#literalStr}.
	 * @param ctx the parse tree
	 */
	void enterLiteralStr(@NotNull OTFQLGrammarParser.LiteralStrContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#literalStr}.
	 * @param ctx the parse tree
	 */
	void exitLiteralStr(@NotNull OTFQLGrammarParser.LiteralStrContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void enterBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#boolExprs}.
	 * @param ctx the parse tree
	 */
	void exitBoolExprs(@NotNull OTFQLGrammarParser.BoolExprsContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitBoolExpr(@NotNull OTFQLGrammarParser.BoolExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#tttt}.
	 * @param ctx the parse tree
	 */
	void enterTttt(@NotNull OTFQLGrammarParser.TtttContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#tttt}.
	 * @param ctx the parse tree
	 */
	void exitTttt(@NotNull OTFQLGrammarParser.TtttContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTFQLGrammarParser#boolOprt}.
	 * @param ctx the parse tree
	 */
	void enterBoolOprt(@NotNull OTFQLGrammarParser.BoolOprtContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTFQLGrammarParser#boolOprt}.
	 * @param ctx the parse tree
	 */
	void exitBoolOprt(@NotNull OTFQLGrammarParser.BoolOprtContext ctx);
}