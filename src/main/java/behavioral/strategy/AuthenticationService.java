package behavioral.strategy;

/**
 * Base class for application
 *
 * @author Milan Rathod
 */
public class AuthenticationService {

    /**
     * Actual authentication done here
     */
    public String authenticate(Authentication authentication) {
        return authentication.performAuthentication();
    }
}
