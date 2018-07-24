package structural.flyweight;

public class FlyWeightDemo {

	public static void main(String[] args) {
		
		for(int i=0;i<10;i++){
			Circle circle=(Circle) ShapeFactory.getShape("circle");
			circle.setColor("Red");
			circle.draw();
		}

	}

}
