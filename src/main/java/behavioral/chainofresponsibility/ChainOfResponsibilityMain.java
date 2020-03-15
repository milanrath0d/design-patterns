package behavioral.chainofresponsibility;

/**
 * Entry point for chain of responsibility design pattern
 *
 * @author Milan Rathod
 */
public class ChainOfResponsibilityMain {

    public static void main(String[] args) {
        TeamLeader teamLeader = new TeamLeader();
        Manager manager = new Manager();
        teamLeader.nextSupervisor(manager);

        teamLeader.applyLeave("Navin", 11);
    }

}
