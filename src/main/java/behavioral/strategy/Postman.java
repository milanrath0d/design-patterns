package behavioral.strategy;

/**
 * Login using postman
 * supports both basic and token authentications
 *
 * @author Milan Rathod
 */
public class Postman extends Application {

    public Postman() {
        authentication = new TokenAuthentication();
    }

    public void specificToPostman() {
        System.out.println("Method specific to postman");
    }
}
