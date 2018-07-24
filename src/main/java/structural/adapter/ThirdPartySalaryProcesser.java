package structural.adapter;

import java.util.List;

public class ThirdPartySalaryProcesser {

	public void processSalary(List<Employee> employeeInfo){
		for(Employee employee:employeeInfo){
			if(employee.getDesignation().equalsIgnoreCase("Team Lead")){
				System.out.println("50000 credited in the account of : "+employee.getName());
			}
			else if(employee.getDesignation().equalsIgnoreCase("Developer")){
				System.out.println("25000 credited in the account of : "+employee.getName());
			}
			else if(employee.getDesignation().equalsIgnoreCase("Tester")){
				System.out.println("20000 credited in the account of : "+employee.getName());
			}
		}
	}
	
}
