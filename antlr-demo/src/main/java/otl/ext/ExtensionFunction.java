package otl.ext;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 20:43
 */
public class ExtensionFunction {

    public static final boolean isGoodIncome(double age, String education, double income) {

        if (income * 0.75 > age) {
            return true;
        }
        return false;
    }


}
