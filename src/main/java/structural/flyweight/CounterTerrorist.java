package structural.flyweight;

/**
 * Player of type counter terrorist
 *
 * @author Milan Rathod
 */
public class CounterTerrorist implements Player {

    // Intrinsic Attribute
    private final String TASK;

    // Extrinsic Attribute
    private String weapon;

    public CounterTerrorist() {
        TASK = "Diffuse a bomb";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void mission() {
        System.out.println("Counter Terrorist with weapon "
                + weapon + " | " + "Task is to " + TASK);
    }
}
