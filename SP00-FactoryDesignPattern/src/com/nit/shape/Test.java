package com.nit.shape;

public class Test {
	public static void main(String[] args) {
		
		shapeFactory sf=new shapeFactory();
		Object obj=sf.getInstance("Circle");
		if(obj instanceof Circle) {
		((Circle) obj).draw();}
		else if(obj instanceof Rectangle) {
			((Rectangle) obj).draw();
		}else if(obj instanceof Triangle) {
			((Triangle) obj).draw();
		}else {
			System.out.println("shape class is not found");
		}
		
	}

}
