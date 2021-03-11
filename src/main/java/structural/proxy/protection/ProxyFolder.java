package structural.proxy.protection;

/**
 * Proxy folder to protect employee from write access
 *
 * @author Milan Rathod
 */
public class ProxyFolder implements Folder {

    private final Employee employee;

    private final Folder folder;

    public ProxyFolder(Employee employee) {
        this.employee = employee;
        this.folder = new RealFolder();
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
            System.out.println("You do not have Write access");
        }
    }
}
