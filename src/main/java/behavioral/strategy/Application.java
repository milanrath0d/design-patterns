package behavioral.strategy;

/**
 * Base class for application
 *
 * @author Milan Rathod
 */
public class Application {

    /**
     * Actual authentication done here
     */
    public void authenticate(Authentication authentication) {
        System.out.println(authentication.performAuthentication());
    }
}
