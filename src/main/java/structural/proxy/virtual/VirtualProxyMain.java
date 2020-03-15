package structural.proxy.virtual;

/**
 * Entry point for virtual proxy design pattern
 *
 * @author Milan Rathod
 */
public class VirtualProxyMain {

    public static void main(String[] args) {
        Image image = new ProxyImage("dummy");
        image.displayImage();

        System.out.println("-----------------");

        image.displayImage();
    }

}
