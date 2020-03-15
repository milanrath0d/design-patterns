package structural.facade;

import java.util.List;

/**
 * Hotel facade for hiding complex logic of returning all menus to users
 *
 * @author Milan Rathod
 */
public class HotelFacade {

    private Hotel vegRestaurant;

    private Hotel nonVegRestaurant;

    public HotelFacade() {
        vegRestaurant = new VegRestaurant();

        nonVegRestaurant = new NonVegRestaurant();
    }

    public List<Menu> getVegMenu() {
        return vegRestaurant.getMenus();
    }

    public List<Menu> getNonVegMenu() {
        return nonVegRestaurant.getMenus();
    }

}
