package structural.proxy.protection;

public class FolderProxy implements IfFolder {
	
	private Employee employee;
	
	

	public FolderProxy(Employee employee) {
		super();
		this.employee = employee;
	}



	@Override
	public void readWriteAccess() {
		if(employee.getDesignation().equalsIgnoreCase("manager")){
			new Folder().readWriteAccess();
			
		}
		else{
			System.out.println("you do not have access");
		}
		

	}

}
