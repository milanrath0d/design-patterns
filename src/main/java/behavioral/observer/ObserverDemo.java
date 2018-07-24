package behavioral.observer;

import java.util.Iterator;
import java.util.List;

public class ObserverDemo {

	public static void main(String[] args) {
		
		Product product=new Product("TV", 25000, "Not available");
		
		Person karan=new Person("karan", product);
		Person arjun=new Person("arjun", product);
		
		List<Observer> subscribers=product.getObservers();
		Iterator<Observer> it=subscribers.iterator();
		while(it.hasNext()){
			Person person=(Person) it.next();
			System.out.println(person.getName()+" has subscribed "+product.getName());
		}
		product.setAvailability("available");

	}

}
