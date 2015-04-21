package otl.func;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * User: Mark Zang
 * Date: 2015/4/21
 * Time: 17:10
 */
public class DefaultFunctions {
    public static final String upper(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }


    public static final String lower(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }


    public static final String trim(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static final String nowStr() {
        SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        Date date = new Date();
        return fmt.format(date);
    }


    public static final long now() {
        return System.currentTimeMillis();
    }
}
