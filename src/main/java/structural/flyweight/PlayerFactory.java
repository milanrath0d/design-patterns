package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Player factory
 *
 * @author Milan Rathod
 */
public class PlayerFactory {

    private static final Map<String, Player> map = new HashMap<>();

    public static Player getPlayer(String type) {
        if (map.containsKey(type)) {
            return map.get(type);
        } else {
            Player player = null;
            switch (type) {
                case "Terrorist":
                    System.out.println("Terrorist Created");
                    player = new Terrorist();
                    break;
                case "CounterTerrorist":
                    System.out.println("Counter Terrorist Created");
                    player = new CounterTerrorist();
                    break;
                default:
                    System.out.println("Unknown player");
            }
            map.put(type, player);
            return player;
        }
    }

}
