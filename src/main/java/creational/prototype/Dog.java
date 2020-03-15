package creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Milan Rathod
 */
@AllArgsConstructor
@Setter
@Getter
public class Dog implements Animal {

    private String name;

    private String color;

    public Animal clone() {
        Dog dog = null;
        try {
            dog = (Dog) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dog;
    }

}
