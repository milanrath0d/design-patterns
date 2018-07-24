package structural.flyweight;

import java.util.HashMap;

public class ShapeFactory {

	private static final HashMap<String,Shape> shapes=new HashMap<String,Shape>();
	
	public static Shape getShape(String shapeType){
		Shape shape=null;
		if(shapeType.equalsIgnoreCase("circle")){
			shape=shapes.get(shapeType);
			if(shape==null){
				shape=new Circle();
				shapes.put("circle", shape);
				System.out.println("Creating circle without any color");
			}
		}
		return shape;
	}
}
