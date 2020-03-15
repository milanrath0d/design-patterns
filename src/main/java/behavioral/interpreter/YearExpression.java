package behavioral.interpreter;

import java.util.Calendar;
import java.util.Date;

/**
 * Expression used for interpreting year
 *
 * @author Milan Rathod
 */
public class YearExpression implements Expression {

    @Override
    public String interpreter(Context context) {
        String expression = context.getFormat();
        Date date = context.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String exp = expression.replaceAll("YYYY", String.valueOf(cal.get(Calendar.YEAR)));
        context.setFormat(exp);
        return context.getFormat();
    }
}
