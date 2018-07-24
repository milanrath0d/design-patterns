package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Product extends Subject {
	
	private String name;
	private int price;
	private String availability;
	private List<Observer> observerList=new ArrayList<>();
	
	
	

	public Product(String name, int price, String availability) {
		super();
		this.name = name;
		this.price = price;
		this.availability = availability;
	}

	public String getName() {
		return name;
	}
	
	public List<Observer> getObservers(){
		return observerList;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
		System.out.println("Changed on the availability of product");
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
		
		System.out.println("Notifying every observer");
		
		System.out.println("Product Name : "+getName()+" Price : "+getPrice());
		
		for(Observer observer:observerList){
			
			observer.update(this.availability);
		}

	}

}
