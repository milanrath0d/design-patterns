package structural.decorator;

public class DecoratorDemo {

	public static void main(String[] args) {
		
		Shape shape=new SimpleCircle();
		System.out.println(shape.draw());
		
		System.out.println(new GreenCircle(shape).draw());

	}

}
