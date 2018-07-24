package behavioral.visitor;

public class ChildSpecialistDoctor implements Visitor {

	private String name;
	private String healthStatus;
	
	
	
	public ChildSpecialistDoctor(String name) {
		super();
		this.name = name;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getHealthStatus() {
		return healthStatus;
	}



	public void setHealthStatus(String healthStatus) {
		this.healthStatus = healthStatus;
	}



	@Override
	public void visit(Visitable visitable) {
		System.out.println("test");
		

	}

}
