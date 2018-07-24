package behavioral.chainofresponsibility;

public class HR extends Employee {
	
	private static final int MAX_DAYS_LEAVE_APPROVE=30;

	@Override
	public void applyLeave(String employeeName, int noOfdays) {
		if(noOfdays<MAX_DAYS_LEAVE_APPROVE){
			approved(employeeName, noOfdays);
		}
		else{
			System.out.println("Your leave application is cancelled. Please contact HR!");
		}

	}
	private void approved(String employeeName, int noOfdays){
		System.out.println(noOfdays+" days leave approved for employee "+employeeName+" by hr");
	}

}
