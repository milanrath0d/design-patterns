package structural.adapter;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAdapter implements IfEmployeeAdapter {
	
	ThirdPartySalaryProcesser thirdPartySalaryProcesser=new ThirdPartySalaryProcesser();

	@Override
	public void processSalary(String[][] employeeInfo) {
		
		int id=0;
		String name=null;
		String designation=null;
		List<Employee> employeeList=new ArrayList<>();
		for(int i=0;i<employeeInfo.length;i++){
			for(int j=0;j<employeeInfo[i].length;j++){
				if(j==0){
					id=Integer.parseInt(employeeInfo[i][j]);
				}
				else if(j==1){
					name=employeeInfo[i][j];
				}
				else if(j==2){
					designation=employeeInfo[i][j];
				}
			}
			employeeList.add(new Employee(id, name, designation));
		}
		System.out.println("Calling third party salary system");
		thirdPartySalaryProcesser.processSalary(employeeList);

	}

}
