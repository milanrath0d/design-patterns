package structural.proxy.virtual;

import lombok.AllArgsConstructor;

/**
 * Real image
 *
 * @author Milan Rathod
 */
@AllArgsConstructor
public class RealImage implements Image {

    private String name;

    @Override
    public void displayImage() {
        System.out.println("Image: " + name + " Displayed");
    }

    public void loadImage() {
        System.out.println("Image: " + name + " Loading!!!");
        displayImage();
    }

}
