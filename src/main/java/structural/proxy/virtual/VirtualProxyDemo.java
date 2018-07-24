package structural.proxy.virtual;

public class VirtualProxyDemo {

	public static void main(String[] args) {
		IfImage ifImage=new ImageProxy("dummy");
		ifImage.displayImage();
		
		System.out.println("-----------------");
		
		ifImage.displayImage();
		

	}

}
