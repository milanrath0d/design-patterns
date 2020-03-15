package behavioral.strategy;

/**
 * Token based authentication
 *
 * @author Milan Rathod
 */
public class TokenAuthentication implements Authentication {

    @Override
    public String performAuthentication() {
        return "Authenticating using token";
    }
}
