package structural.facade;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Test for Facade Pattern implementation
 */
class FacadeTest {

    @Test
    void testHotelFacadeGetVegMenu() {
        HotelFacade hotelFacade = new HotelFacade();
        List<Menu> vegMenus = hotelFacade.getVegMenu();
        
        assertNotNull(vegMenus);
        assertFalse(vegMenus.isEmpty());
    }
    
    @Test
    void testHotelFacadeGetNonVegMenu() {
        HotelFacade hotelFacade = new HotelFacade();
        List<Menu> nonVegMenus = hotelFacade.getNonVegMenu();
        
        assertNotNull(nonVegMenus);
        assertFalse(nonVegMenus.isEmpty());
    }
    
    @Test
    void testVegRestaurantImplementation() {
        Hotel vegRestaurant = new VegRestaurant();
        List<Menu> menus = vegRestaurant.getMenus();
        
        assertNotNull(menus);
        assertFalse(menus.isEmpty());
    }
    
    @Test
    void testNonVegRestaurantImplementation() {
        Hotel nonVegRestaurant = new NonVegRestaurant();
        List<Menu> menus = nonVegRestaurant.getMenus();
        
        assertNotNull(menus);
        assertFalse(menus.isEmpty());
    }
} 