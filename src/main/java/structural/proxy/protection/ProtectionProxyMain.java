package structural.proxy.protection;

/**
 * Entry point for protection proxy design pattern
 *
 * @author Milan Rathod
 */
public class ProtectionProxyMain {

    public static void main(String[] args) {
        Employee manager = new Employee("Ravi", "Manager");
        Folder folder = new ProxyFolder(manager);
        folder.readAccess();
        folder.writeAccess();

        Employee employee = new Employee("Kohli", "Employee");
        folder = new ProxyFolder(employee);
        folder.readAccess();
        folder.writeAccess();
    }

}
