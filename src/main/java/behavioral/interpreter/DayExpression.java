package behavioral.interpreter;

import java.util.Calendar;
import java.util.Date;

/**
 * Expression used for interpreting day
 *
 * @author Milan Rathod
 */
public class DayExpression implements Expression {

    @Override
    public String interpreter(Context context) {
        String expression = context.getFormat();
        Date date = context.getDate();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        String exp = expression.replaceAll("DD", String.valueOf(cal.get(Calendar.DATE)));
        context.setFormat(exp);
        return context.getFormat();
    }
}
