package behavioral.interpreter;

import java.util.Calendar;
import java.util.Date;

/**
 * Expression used for interpreting month
 *
 * @author Milan Rathod
 */
public class MonthExpression implements Expression {

    @Override
    public String interpreter(Context context) {
        String expression = context.getFormat();
        Date date = context.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String exp = expression.replaceAll("MM", String.valueOf(cal.get(Calendar.MONTH) + 1));
        context.setFormat(exp);
        return context.getFormat();
    }
}
