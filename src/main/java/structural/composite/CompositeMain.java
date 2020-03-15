package structural.composite;

/**
 * Entry point for composite design pattern
 *
 * @author Milan Rathod
 */
public class CompositeMain {

    public static void main(String[] args) {
        Employee developer1 = new Developer("Virat");
        Employee developer2 = new Developer("Rohit");

        CompanyDirectory employeeDirectory = new CompanyDirectory();
        employeeDirectory.addEmployee(developer1);
        employeeDirectory.addEmployee(developer2);

        Employee manager = new Manager("Ravi");

        CompanyDirectory managerDirectory = new CompanyDirectory();
        managerDirectory.addEmployee(manager);

        CompanyDirectory companyDirectory = new CompanyDirectory();
        companyDirectory.addEmployee(employeeDirectory);
        companyDirectory.addEmployee(managerDirectory);

        companyDirectory.displayDetails();
    }

}
