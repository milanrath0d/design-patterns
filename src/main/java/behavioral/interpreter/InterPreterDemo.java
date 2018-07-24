package behavioral.interpreter;

import java.util.Date;

public class InterPreterDemo {

	public static void main(String[] args) {
		
		System.out.println("Date Formate");
		String dateFormat="MM-DD-YYYY";
		
		Context context=new Context();
		context.setExpression(dateFormat);
		context.setDate(new Date());
		Expression expression;
		String[] arr=dateFormat.split("-");
		for(String str:arr){
			if(str.equals("DD")){
				expression=new DayExpression();
				expression.evalute(context);
			}
			else if(str.equals("MM")){
				expression=new MonthExpression();
				expression.evalute(context);
			}
			else if(str.equals("YYYY")){
				expression=new YearExpression();
				expression.evalute(context);
			}
		}
		System.out.println(context.getExpression());

	}

}
