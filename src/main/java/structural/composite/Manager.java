package structural.composite;

/**
 * Manger - leaf
 *
 * @author Milan Rathod
 */
public class Manager implements Employee {

    private final String name;

    private final String designation;

    public Manager(String name) {
        this.name = name;
        this.designation = "Manager";
    }

    @Override
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Designation: " + designation);
    }
}
