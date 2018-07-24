package structural.proxy.protection;

public class Folder implements IfFolder {

	@Override
	public void readWriteAccess() {
		System.out.println("You have Read/Write Access");
	}

}
