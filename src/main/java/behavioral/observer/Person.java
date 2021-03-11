package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

/**
 * Person class
 *
 * @author Milan Rathod
 */
@Getter
@Setter
public class Person implements Observer {

    private String name;

    public Person(String name) {
        super();
        this.name = name;
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello " + name + ", Product is available now!!");
    }

}
