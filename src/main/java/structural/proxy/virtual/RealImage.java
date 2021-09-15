package structural.proxy.virtual;

/**
 * Real image
 *
 * @author Milan Rathod
 */
public class RealImage implements Image {

    private final String name;

    public RealImage(String name) {
        this.name = name;
        loadImage();
    }

    @Override
    public void displayImage() {
        System.out.println("Image: " + name + " Displayed!");
    }

    public void loadImage() {
        System.out.println("Image: " + name + " Loading!!!");
    }

}
