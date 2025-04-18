package behavioral.chainofresponsibility;

/**
 * @author Milan Rathod
 */
public class Manager extends Employee {

    private static final int MAX_DAYS_OF_LEAVES_APPROVED = 30;

    @Override
    public void applyLeave(String employeeName, int days) {
        if (days <= MAX_DAYS_OF_LEAVES_APPROVED) {
            approved(employeeName, days);
        } else if (supervisor != null) {
            System.out.println("Leave Request being forwarded from " + this.getClass().getSimpleName() + " to " + supervisor.getClass().getSimpleName());
            supervisor.applyLeave(employeeName, days);
        } else {
            System.out.println("Leave Request DENIED for " + employeeName + " for " + days + " days (exceeds maximum allowed)");
        }
    }

    private void approved(String employeeName, int days) {
        System.out.println(days + " days leave approved for employee " + employeeName + " by manager");
    }

}
