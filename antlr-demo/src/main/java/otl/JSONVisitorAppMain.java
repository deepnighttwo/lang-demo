package otl;

import com.google.gson.Gson;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import otl.grammar.OTLLexer;
import otl.grammar.OTLParser;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * User: Mark Zang
 * Date: 2015/4/16
 * Time: 16:30
 */
public class JSONVisitorAppMain {

    static Gson gson = new Gson();

    public static void main(String[] args) throws IOException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {


        Map data = gson.fromJson(new InputStreamReader(JSONVisitorAppMain.class.getResourceAsStream("/person.json")), Map.class);

        String otl = "select\n" +
                "     person.name as name,\n" +
                "     upper(person.addr) as addr,\n" +
                "     person.workexp[0].companyName as firstworkCompany,\n" +
                "     isGoodIncome(person.age, person.education, person.income) as isGoodIncome,\n" +
                "     (person.income-person.startIncome)/person.workyear as salaryIncreaseYearly,\n" +
                "     null as furtherdata,\n" +
                "     nowStr() as datetime,\n" +
                "     \"Phase1\" as currStep,\n" +
                "     99 as status,\n" +
                "     'a' as grade,\n" +
                "     98.5 as mark\n" +
                " from PersonData as person\n" +
                " where (person.age > 30 and person.workyear > 7) \n" +
                "    or person.location=\"shanghai\"\n" +
                "    or person.education=\"doctor\"";

        ANTLRInputStream inputStream = new ANTLRInputStream(new ByteArrayInputStream(otl.getBytes()));
        OTLLexer lexer = new OTLLexer(inputStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        OTLParser otlParse = new OTLParser(tokenStream);

        OTLParser.QlContext qlContext = otlParse.ql();
        System.out.println(qlContext.getText());

        OTLParser.SelectContext selectContext = qlContext.select();
        OTLParser.FromContext fromCtx = qlContext.from();
        OTLParser.WhereContext whereContext = qlContext.where();


        Map mixData = new LinkedHashMap();
        String from = fromCtx.fromSource.getText();

        if (fromCtx.fromAlias != null) {
            String fromAlias = fromCtx.fromAlias.getText();
            mixData.put(fromAlias, data);
        }

//        visitor.setRawData(mixData);
//
//        if (whereContext != null) {
//            boolean whereResult = (boolean) visitor.visit(whereContext);
//            System.out.println(whereResult);
//        }
//
//        Object result = visitor.visit(selectContext);

//        LogFacade.log(result);


    }
}
