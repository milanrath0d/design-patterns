package behavioral.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for Strategy Pattern implementation
 */
class StrategyTest {

    @Test
    void testBasicAuthentication() {
        AuthenticationService service = new AuthenticationService();
        Authentication basicAuth = new BasicAuthentication();
        
        String result = service.authenticate(basicAuth);
        
        assertEquals("Authenticated with Basic Auth", result);
    }
    
    @Test
    void testTokenAuthentication() {
        AuthenticationService service = new AuthenticationService();
        Authentication tokenAuth = new TokenAuthentication();
        
        String result = service.authenticate(tokenAuth);
        
        assertEquals("Authenticated with Token", result);
    }
    
    @Test
    void testChangeStrategy() {
        AuthenticationService service = new AuthenticationService();
        
        // First use basic auth
        Authentication basicAuth = new BasicAuthentication();
        String basicResult = service.authenticate(basicAuth);
        
        // Then switch to token auth
        Authentication tokenAuth = new TokenAuthentication();
        String tokenResult = service.authenticate(tokenAuth);
        
        // Verify both strategies worked correctly
        assertEquals("Authenticated with Basic Auth", basicResult);
        assertEquals("Authenticated with Token", tokenResult);
    }
}