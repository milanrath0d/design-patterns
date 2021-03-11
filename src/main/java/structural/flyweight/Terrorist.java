package structural.flyweight;

/**
 * Player of type terrorist
 *
 * @author Milan Rathod
 */
public class Terrorist implements Player {

    // Intrinsic attribute
    private final String task;

    // Extrinsic attribute
    private String weapon;

    public Terrorist() {
        this.task = "Plant a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Terrorist with weapon " + weapon + " | " + "Task is to " + task);
    }
}
