// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otl/grammar\OTL.g4 by ANTLR 4.5
package otl.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link OTLParser}.
 */
public interface OTLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link OTLParser#ql}.
	 * @param ctx the parse tree
	 */
	void enterQl(@NotNull OTLParser.QlContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#ql}.
	 * @param ctx the parse tree
	 */
	void exitQl(@NotNull OTLParser.QlContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(@NotNull OTLParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(@NotNull OTLParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#from}.
	 * @param ctx the parse tree
	 */
	void enterFrom(@NotNull OTLParser.FromContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#from}.
	 * @param ctx the parse tree
	 */
	void exitFrom(@NotNull OTLParser.FromContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#where}.
	 * @param ctx the parse tree
	 */
	void enterWhere(@NotNull OTLParser.WhereContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#where}.
	 * @param ctx the parse tree
	 */
	void exitWhere(@NotNull OTLParser.WhereContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void enterPropsSel(@NotNull OTLParser.PropsSelContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#propsSel}.
	 * @param ctx the parse tree
	 */
	void exitPropsSel(@NotNull OTLParser.PropsSelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FloatVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterFloatVar(@NotNull OTLParser.FloatVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FloatVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitFloatVar(@NotNull OTLParser.FloatVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NullVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterNullVar(@NotNull OTLParser.NullVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NullVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitNullVar(@NotNull OTLParser.NullVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CharVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterCharVar(@NotNull OTLParser.CharVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CharVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitCharVar(@NotNull OTLParser.CharVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FuncVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterFuncVar(@NotNull OTLParser.FuncVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FuncVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitFuncVar(@NotNull OTLParser.FuncVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(@NotNull OTLParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(@NotNull OTLParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(@NotNull OTLParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(@NotNull OTLParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterParens(@NotNull OTLParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitParens(@NotNull OTLParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DirectPropVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DirectPropVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterIntVar(@NotNull OTLParser.IntVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitIntVar(@NotNull OTLParser.IntVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BooleanVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterBooleanVar(@NotNull OTLParser.BooleanVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BooleanVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitBooleanVar(@NotNull OTLParser.BooleanVarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void enterStringVar(@NotNull OTLParser.StringVarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 */
	void exitStringVar(@NotNull OTLParser.StringVarContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void enterPropFullName(@NotNull OTLParser.PropFullNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#propFullName}.
	 * @param ctx the parse tree
	 */
	void exitPropFullName(@NotNull OTLParser.PropFullNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#propName}.
	 * @param ctx the parse tree
	 */
	void enterPropName(@NotNull OTLParser.PropNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#propName}.
	 * @param ctx the parse tree
	 */
	void exitPropName(@NotNull OTLParser.PropNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CompareBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterCompareBool(@NotNull OTLParser.CompareBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CompareBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitCompareBool(@NotNull OTLParser.CompareBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ParenBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterParenBool(@NotNull OTLParser.ParenBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ParenBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitParenBool(@NotNull OTLParser.ParenBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterExprBool(@NotNull OTLParser.ExprBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitExprBool(@NotNull OTLParser.ExprBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void enterNotBool(@NotNull OTLParser.NotBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 */
	void exitNotBool(@NotNull OTLParser.NotBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link OTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(@NotNull OTLParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link OTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(@NotNull OTLParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TrueBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterTrueBool(@NotNull OTLParser.TrueBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TrueBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitTrueBool(@NotNull OTLParser.TrueBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FalseBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFalseBool(@NotNull OTLParser.FalseBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FalseBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFalseBool(@NotNull OTLParser.FalseBoolContext ctx);
}