package behavioral.strategy;

/**
 * Base class for application
 *
 * @author Milan Rathod
 */
abstract public class Application {

    protected Authentication authentication;

    /**
     * Dummy method
     */
    public String reusableCode() {
        return "Reusable code being used in sub class";
    }

    public void setAuthentication(Authentication authentication) {
        this.authentication = authentication;
    }

    /**
     * Actual authentication done here
     */
    public void authenticate() {
        System.out.println(authentication.performAuthentication());
    }
}
