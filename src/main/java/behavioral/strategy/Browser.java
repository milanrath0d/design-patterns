package behavioral.strategy;

/**
 * Login using browser
 * Only supports basic auth
 *
 * @author Milan Rathod
 */
public class Browser extends Application {

    public Browser() {
        authentication = new BasicAuthentication();
    }

    public void specificToBrowser() {
        System.out.println("Method specific to browser");
    }
}
