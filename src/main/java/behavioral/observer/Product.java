package behavioral.observer;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * Product class
 *
 * @author Milan Rathod
 */
@Setter
@Getter
public class Product extends Subject {

    private String name;

    private int price;

    private String availability;

    private final List<Observer> observerList = new ArrayList<>();

    public Product(String name, int price, String availability) {
        super();
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
        System.out.println("Product: " + name + " is now available!");
        System.out.println("Notifying every observers");
        notifyObservers();
    }

    @Override
    public void register(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void deRegister(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observerList.forEach(observer -> observer.update(this.availability));
    }

}
