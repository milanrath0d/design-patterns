package structural.proxy.virtual;

public class RealImage implements IfImage{

	@Override
	public void displayImage() {
		
		System.out.println("Image displayed");
		
		
		
	}
	
	public void loadImage(){
		System.out.println("Image loaded");
		displayImage();
	}

	
	
}
