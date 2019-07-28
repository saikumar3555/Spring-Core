package com.nit.shape;

public class shapeFactory {

	public Object getInstance(String shapeType) {
		if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		else if(shapeType.equalsIgnoreCase("Rectangle")) {
			return new Rectangle();

		}else if(shapeType.equalsIgnoreCase("Triangle")){
			return new Triangle();
		}else {
			return null;
		}
		
	}
}
