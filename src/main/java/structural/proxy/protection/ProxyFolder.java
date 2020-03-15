package structural.proxy.protection;

/**
 * Proxy folder to protect employee from write access
 *
 * @author Milan Rathod
 */
public class ProxyFolder implements Folder {

    private Employee employee;

    private Folder folder = new RealFolder();

    public ProxyFolder(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void readAccess() {
        folder.readAccess();
    }

    @Override
    public void writeAccess() {
        if (employee.getDesignation().equalsIgnoreCase("manager")) {
            folder.writeAccess();
        } else {
            System.out.println("you do not have write access");
        }
    }
}
