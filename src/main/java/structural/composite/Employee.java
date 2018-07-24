package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Employee implements IfEmployee {
	
	private String name;
	private int monthlySalary;
	private String designation;
	private List<IfEmployee> subordinateList=new ArrayList<IfEmployee>();
	
	
	

	public Employee(String name, int monthlySalary, String designation) {
		super();
		this.name = name;
		this.monthlySalary = monthlySalary;
		this.designation = designation;
	}


	@Override
	public int yearlySalary() {
		return monthlySalary*12;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getMonthlySalary() {
		return monthlySalary;
	}


	public void setMonthlySalary(int monthlySalary) {
		this.monthlySalary = monthlySalary;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public List<IfEmployee> getSubordinateList() {
		return subordinateList;
	}


	public void setSubordinateList(List<IfEmployee> subordinateList) {
		this.subordinateList = subordinateList;
	}
	
	public void addSubordinate(IfEmployee ifEmployee){
		subordinateList.add(ifEmployee);
	}
	
	public void removeSubordinate(IfEmployee ifEmployee){
		subordinateList.remove(ifEmployee);
	}
	
	public List<IfEmployee> getChilds(){
		return subordinateList;
	}
	
	
	

}
