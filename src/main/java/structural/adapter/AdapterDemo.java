package structural.adapter;

import structural.composite.Employee;

public class AdapterDemo {

	public static void main(String[] args) {
		IfEmployeeAdapter ifEmployeeAdapter=new EmployeeClassAdapter();
		System.out.println("HR System to Process Salary");
		ifEmployeeAdapter.processSalary(getEmployeeInfo());

	}
	private static String[][] getEmployeeInfo(){
		
		String[][] employess=new String[4][];
		
		employess[0]=new String[]{"101","e1","Team Lead"};
		employess[1]=new String[]{"102","e2","Developer"};
		employess[2]=new String[]{"103","e3","Developer"};
		employess[3]=new String[]{"104","e4","Tester"};
		return employess;
	
		
	}

}
