package behavioral.interpreter;

import java.util.Calendar;
import java.util.Date;

public class DayExpression extends Expression {

	@Override
	void evalute(Context context) {
		
		String expression=context.getExpression();
		Date date=context.getDate();
		Calendar cal=Calendar.getInstance();
		cal.setTime(date);
		String exp=expression.replaceAll("DD",String.valueOf(cal.get(Calendar.DAY_OF_WEEK)));
		context.setExpression(exp);
		

	}

}
