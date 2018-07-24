package structural.composite;

public class SoftwareEngineer implements IfEmployee {

	private String name;
	private int monthlySalary;
	private String designation;

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
	
	


}
