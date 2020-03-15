package behavioral.observer;

/**
 * Person class
 *
 * @author Milan Rathod
 */
public class Person implements Observer {

    private String name;

    public Person(String name, Subject subject) {
        super();
        this.name = name;
        subject.register(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello! " + name + " Product is available now");
    }

}
