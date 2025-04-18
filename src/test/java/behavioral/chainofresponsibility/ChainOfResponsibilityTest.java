package behavioral.chainofresponsibility;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Test for Chain of Responsibility Pattern implementation
 */
class ChainOfResponsibilityTest {

    @Test
    void testUsernamePasswordAuthentication() {
        // Create the chain: OAuth -> UsernamePassword -> null
        AuthenticationProcessor authProcessor = new OAuthAuthenticationProcessor(
                new UsernamePasswordAuthenticationProcessor(null));
        
        AuthenticationProvider authProvider = new UsernamePasswordProvider();
        
        assertTrue(authProcessor.isAuthorized(authProvider));
    }
    
    @Test
    void testOAuthAuthentication() {
        // Create the chain: OAuth -> UsernamePassword -> null
        AuthenticationProcessor authProcessor = new OAuthAuthenticationProcessor(
                new UsernamePasswordAuthenticationProcessor(null));
        
        AuthenticationProvider authProvider = new OAuthTokenProvider();
        
        assertTrue(authProcessor.isAuthorized(authProvider));
    }
    
    @Test
    void testUnknownAuthentication() {
        // Create the chain: OAuth -> UsernamePassword -> null
        AuthenticationProcessor authProcessor = new OAuthAuthenticationProcessor(
                new UsernamePasswordAuthenticationProcessor(null));
        
        AuthenticationProvider authProvider = new SamlAuthenticationProvider();
        
        // Should fail since neither processor handles SAML
        assertFalse(authProcessor.isAuthorized(authProvider));
    }
    
    @Test
    void testTeamLeaderLeaveApproval() {
        // Set up the chain: TeamLeader -> Manager
        Manager manager = new Manager();
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.nextSupervisor(manager);
        
        // Test leave approval - no exceptions means it works
        assertDoesNotThrow(() -> teamLeader.applyLeave("John", 5));
    }
    
    @Test
    void testManagerLeaveApproval() {
        // Set up the chain: TeamLeader -> Manager
        Manager manager = new Manager();
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.nextSupervisor(manager);
        
        // Test leave approval escalated to manager
        assertDoesNotThrow(() -> teamLeader.applyLeave("John", 15));
    }
    
    @Test
    void testNoLeaveApproval() {
        // Set up the chain: TeamLeader -> Manager
        Manager manager = new Manager();
        TeamLeader teamLeader = new TeamLeader();
        teamLeader.nextSupervisor(manager);
        
        // Leave over 30 days will not be approved, but will not throw exceptions
        assertDoesNotThrow(() -> teamLeader.applyLeave("John", 35));
    }
}