package sql;

import com.google.gson.Gson;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * User: mzang
 * Date: 2015-03-13
 * Time: 14:27
 */
public class ANTLR4SQLParser {

    public static final ANTLR4SQLParser instance = new ANTLR4SQLParser();

    private static Gson gson = new Gson();

    ParseTree tree;

    private ANTLR4SQLParser() {

    }

    String updateSQL(String sql) throws IOException {

        InputStream is = new ByteArrayInputStream(sql.getBytes());

        ANTLRInputStream input = new ANTLRInputStream(is);

        // create a lexer that feeds off of input CharStream
        QueryLexer lexer = new QueryLexer(input);

        // create a buffer of tokens pulled from the lexer
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // create a parser that feeds off the tokens buffer
        QueryParser parser = new QueryParser(tokens);

        tree = parser.query(); // begin parsing at init rule

        return tree.toStringTree(parser);
    }

    Map executeSqlOnJSON(String json) {
        Map map = new HashMap();
        map.put("asdfa", "asdsdffasdf");
        map.put("asdfasadf", "asdfwaerasdf");
        map.put("asdwaefa", "asdfaasesdf");

        return map;
    }


}
