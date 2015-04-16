package otl;

import com.deepnighttwo.otl.grammar.gen.OTLLexer;
import com.deepnighttwo.otl.grammar.gen.OTLParser;
import com.google.gson.Gson;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/16
 * Time: 16:30
 */
public class JSONVisitorAppMain {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException {
        Map data = gson.fromJson(new InputStreamReader(JSONVisitorAppMain.class.getResourceAsStream("/person.json")), Map.class);
        System.out.println(data);

        String otl = "select\n" +
                "     person.name as name,\n" +
                "     upper(person.addr) as addr,\n" +
                "     person.workexp[0] as firstwork,\n" +
                "     isGoodInCome(person.age, person.education, person.income) as isGoodIncome,\n" +
                "     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,\n" +
                "     null as furtherdata,\n" +
                "     now() as datetime,\n" +
                "     \"Phase1\" as currStep,\n" +
                "     99 as status,\n" +
                "     'a' as grade,\n" +
                "     98.5 as mark\n" +
                " from person\n" +
                " where (person.age > 30 and person.workyear > 7) \n" +
                "    or person.location=\"shanghai\"\n" +
                "    or person.education=\"doctor\"";

        ANTLRInputStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(otl.getBytes()));
        OTLLexer lexer = new OTLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        OTLParser otlParse = new OTLParser(tokenStream);

        OTLParser.QlContext qlContext = otlParse.ql();

        OTLParser.SelectContext selectContext = qlContext.select();
        OTLParser.FromContext fromCtx = qlContext.from();
        OTLParser.WhereContext whereContext = qlContext.where();

        JSONOTLVisitor visitor = new JSONOTLVisitor();
        String from = (String) visitor.visit(fromCtx);

        visitor.visit(selectContext);

        visitor.visit(whereContext);

        System.out.println(from);


    }
}
