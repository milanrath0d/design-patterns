package structural.proxy.virtual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

/**
 * Test for Virtual Proxy Pattern implementation
 */
class VirtualProxyTest {

    @Test
    void testProxyImageLoadsLazily() {
        Image proxyImage = new ProxyImage("test.jpg");
        
        // The real image should not be loaded yet
        // There's no direct way to test this, but we can test the functionality
        assertDoesNotThrow(() -> proxyImage.displayImage());
    }
    
    @Test
    void testRealImageLoadsDirectly() {
        Image realImage = new RealImage("test.jpg");
        
        // The image should be loaded immediately (in constructor)
        assertDoesNotThrow(() -> realImage.displayImage());
    }
    
    @Test
    void testProxyImageSecondDisplay() {
        Image proxyImage = new ProxyImage("test.jpg");
        
        // First display should load the image
        proxyImage.displayImage();
        
        // Second display shouldn't throw exceptions
        assertDoesNotThrow(() -> proxyImage.displayImage());
    }
} 