package behavioral.strategy;

/**
 * Basic username & password based authentication
 *
 * @author Milan Rathod
 */
public class BasicAuthentication implements Authentication {

    @Override
    public String performAuthentication() {
        return "Authenticated with Basic Auth";
    }
}
