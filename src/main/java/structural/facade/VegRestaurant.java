package structural.facade;

import java.util.List;

/**
 * Veg Restaurant
 *
 * @author Milan Rathod
 */
public class VegRestaurant implements Hotel {
    @Override
    public List<Menu> getMenus() {
        return List.of(new Menu("Paneer", 100), new Menu("Aloo", 80));
    }
}
