package behavioral.interpreter;

import java.util.Date;

/**
 * Entry point for interpreter design pattern
 *
 * @author Milan Rathod
 */
public class InterpreterMain {

    public static void main(String[] args) {
        Date date = new Date();
        String dateFormat = "MM-DD-YYYY";

        System.out.println("Original Date: " + date.toString());
        System.out.println("Date format to use: " + dateFormat);

        Context context = new Context();
        context.setFormat(dateFormat);
        context.setDate(date);
        Expression expression = new DefaultExpression();

        String formattedDate = expression.interpreter(context);

        System.out.println("Formatted Date: " + formattedDate);
    }

}
