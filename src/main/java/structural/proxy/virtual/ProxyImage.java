package structural.proxy.virtual;

/**
 * Proxied image
 *
 * @author Milan Rathod
 */
public class ProxyImage implements Image {

    private RealImage realImage;

    private final String name;

    public ProxyImage(String name) {
        this.name = name;
    }

    @Override
    public void displayImage() {
        if (realImage == null) {
            realImage = new RealImage(name);
        }
        realImage.displayImage();
    }

}
