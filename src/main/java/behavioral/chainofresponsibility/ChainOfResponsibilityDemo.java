package behavioral.chainofresponsibility;

public class ChainOfResponsibilityDemo {

	public static void main(String[] args) {
		TeamLeader teamLeader=new TeamLeader();
		Manager manager=new Manager();
		HR hr=new HR();
		teamLeader.nextSupervisor(manager);
		manager.nextSupervisor(hr);
		
		teamLeader.applyLeave("Navin", 11);

	}

}
