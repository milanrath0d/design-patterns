package behavioral.interpreter;

import java.util.Calendar;
import java.util.Date;

public class YearExpression extends Expression {

	void evalute(Context context) {
		
		String expression=context.getExpression();
		Date date=context.getDate();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		String exp=expression.replaceAll("YYYY",String.valueOf(cal.get(Calendar.YEAR)));
		context.setExpression(exp);
		

	}

}
