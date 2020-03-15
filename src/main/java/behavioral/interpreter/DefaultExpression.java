package behavioral.interpreter;

/**
 * Default expression
 *
 * @author Milan Rathod
 */
public class DefaultExpression implements Expression {

    @Override
    public String interpreter(Context context) {
        String[] arr = context.getFormat().split("-");
        Expression expression;
        for (String str : arr) {
            if (str.equals("DD")) {
                expression = new DayExpression();
                expression.interpreter(context);
            } else if (str.equals("MM")) {
                expression = new MonthExpression();
                expression.interpreter(context);
            } else if (str.equals("YYYY")) {
                expression = new YearExpression();
                expression.interpreter(context);
            }
        }
        return context.getFormat();
    }
}
