package behavioral.chainofresponsibility;

public abstract class Employee {

	protected Employee supervisor;

	public void nextSupervisor(Employee supervisor){
		this.supervisor=supervisor;
	}
	
	public abstract void applyLeave(String employeeName,int noOfdays);
}
