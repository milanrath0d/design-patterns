package structural.proxy.virtual;

public class ImageProxy implements IfImage {
	
	private RealImage realImage = null;
	private String filename = null;
	
	public ImageProxy(String filename) {
		super();
		this.filename  = filename;
	}

	@Override
	public void displayImage() {
		if (realImage==null) {
			realImage=new RealImage();
			realImage.loadImage();
		}
		else{
			realImage.displayImage();	
		}
		
		
	}


	

}
