package behavioral.strategy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * @author Milan Rathod
 */
class StrategyTest {

    private AuthenticationService authenticationService;

    @BeforeEach
    public void init() {
        authenticationService = new AuthenticationService();

    }

    @Test
    public void testBasicAuthentication() {
        final String result = authenticationService.authenticate(new BasicAuthentication());

        Assertions.assertEquals("Authenticating using basic auth", result);
    }

    @Test
    public void testTokenAuthentication() {
        final String result = authenticationService.authenticate(new TokenAuthentication());

        Assertions.assertEquals("Authenticating using token", result);
    }

}