package structural.proxy.protection;

public class ProtectionProxyDemo {

	public static void main(String[] args) {
		Employee e1=new Employee("e1", "manager1");
		IfFolder ifFolder=new FolderProxy(e1);
		ifFolder.readWriteAccess();

	}

}
