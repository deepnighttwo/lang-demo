// Generated from G:/mymise/lang-demo/antlr-demo/src/main/java/otl/grammar\OTL.g4 by ANTLR 4.5
package otl.grammar;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link OTLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface OTLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link OTLParser#ql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQl(@NotNull OTLParser.QlContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(@NotNull OTLParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom(@NotNull OTLParser.FromContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhere(@NotNull OTLParser.WhereContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#propsSel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropsSel(@NotNull OTLParser.PropsSelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FloatVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFloatVar(@NotNull OTLParser.FloatVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NullVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullVar(@NotNull OTLParser.NullVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CharVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharVar(@NotNull OTLParser.CharVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVar(@NotNull OTLParser.FuncVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMulDiv(@NotNull OTLParser.MulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddSub(@NotNull OTLParser.AddSubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParens(@NotNull OTLParser.ParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DirectPropVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirectPropVar(@NotNull OTLParser.DirectPropVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IntVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntVar(@NotNull OTLParser.IntVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BooleanVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanVar(@NotNull OTLParser.BooleanVarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringVar}
	 * labeled alternative in {@link OTLParser#propVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringVar(@NotNull OTLParser.StringVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#propFullName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropFullName(@NotNull OTLParser.PropFullNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#propName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPropName(@NotNull OTLParser.PropNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CompareBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompareBool(@NotNull OTLParser.CompareBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ParenBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenBool(@NotNull OTLParser.ParenBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBool(@NotNull OTLParser.ExprBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotBool}
	 * labeled alternative in {@link OTLParser#boolExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotBool(@NotNull OTLParser.NotBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link OTLParser#integerLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(@NotNull OTLParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TrueBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueBool(@NotNull OTLParser.TrueBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FalseBool}
	 * labeled alternative in {@link OTLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseBool(@NotNull OTLParser.FalseBoolContext ctx);
}