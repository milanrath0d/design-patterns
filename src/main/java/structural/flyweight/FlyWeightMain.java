package structural.flyweight;

import java.util.Random;

/**
 * Entry point for fly weight design pattern
 *
 * @author Milan Rathod
 */
public class FlyWeightMain {

    private static String[] playerType = {"Terrorist", "CounterTerrorist"};

    private static String[] weapons = {"AK-47", "Maverick", "Gut Knife", "Desert Eagle"};

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Player player = PlayerFactory.getPlayer(getRandPlayerType());

            player.assignWeapon(getRandWeapon());

            player.mission();
        }
    }

    /**
     * Utility methods to get a random player type
     */
    public static String getRandPlayerType() {
        Random random = new Random();

        // Will return an integer between [0,2)
        int randInt = random.nextInt(playerType.length);

        // return the player stored at index 'randInt'
        return playerType[randInt];
    }

    /**
     * Utility methods to get a random weapon
     */
    public static String getRandWeapon() {
        Random random = new Random();

        // Will return an integer between [0,5)
        int randInt = random.nextInt(weapons.length);

        // Return the weapon stored at index 'randInt'
        return weapons[randInt];
    }

}
