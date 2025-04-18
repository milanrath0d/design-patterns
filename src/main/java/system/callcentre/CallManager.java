package system.callcentre;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.Queue;

/**
 * @author Milan Rathod
 */
public class CallManager {

    private static final int LEVELS = 3;

    private final List<Employee>[] employees;

    private final Queue<Call> callQueue;

    public CallManager(int numberOfFreshers, int numberOfLeads) {
        this.employees = new ArrayList[LEVELS];
        this.callQueue = new LinkedList<>();

        // Adding freshers
        List<Employee> fresherList = new ArrayList<>();

        for (int index = 0; index < numberOfFreshers; index++) {
            fresherList.add(new Fresher("Fresher-" + index, true, this));
        }

        this.employees[0] = fresherList;

        // Adding leads
        List<Employee> leadList = new ArrayList<>();

        for (int index = 0; index < numberOfLeads; index++) {
            leadList.add(new Lead("Lead-" + index, true, this));
        }

        this.employees[1] = leadList;

        // Adding managers
        List<Employee> managerList = new ArrayList<>();

        managerList.add(new Manager("Manager", true, this));

        this.employees[2] = managerList;
    }

    public Employee getFreeEmployee(int rank) {
        for (int index = rank - 1; index < LEVELS; index++) {
            Optional<Employee> optionalEmployee = this.employees[index].stream().filter(Employee::isFree).findFirst();

            if (optionalEmployee.isPresent()) {
                return optionalEmployee.get();
            }
        }

        return null;
    }

    public void handleCallFromQueue() {
        if (callQueue.size() > 0) {
            Call call = callQueue.peek();
            int callRank = call.getRank();
            Employee employee = getFreeEmployee(callRank);
            if (employee != null) {
                callQueue.remove();
                employee.receiveCall(call);
            }
        }
    }

    public void end() {
        handleCallFromQueue();
    }

    public void handle(Call call) {
        Employee employee = getFreeEmployee(call.getRank());

        if (employee != null) {
            call.setRank(employee.getRank());
            employee.receiveCall(call);
        } else {
            System.out.println("Putting Call in Queue for " + call.getCustomer().getName());
            callQueue.add(call);
        }
    }
}
