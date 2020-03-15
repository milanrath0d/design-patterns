package structural.proxy.protection;

/**
 * @author Milan Rathod
 */
public class RealFolder implements Folder {

    @Override
    public void readAccess() {
        System.out.println("You have Read Access");
    }

    @Override
    public void writeAccess() {
        System.out.println("You have Write Access");
    }
}
