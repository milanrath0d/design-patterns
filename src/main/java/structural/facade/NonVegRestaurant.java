package structural.facade;

import java.util.List;

/**
 * Non veg restaurant
 *
 * @author Milan Rathod
 */
public class NonVegRestaurant implements Hotel {

    @Override
    public List<Menu> getMenus() {
        return List.of(new Menu("Chicken", 150), new Menu("Fish", 200));
    }
}
