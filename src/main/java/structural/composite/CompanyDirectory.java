package structural.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Directory contains employee details - Composite
 *
 * @author Milan Rathod
 */
public class CompanyDirectory implements Employee {

    private final List<Employee> employeeList = new ArrayList<>();

    @Override
    public void displayDetails() {
        employeeList.forEach(Employee::displayDetails);
    }

    public void addEmployee(Employee employee) {
        employeeList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeeList.remove(employee);
    }
}
