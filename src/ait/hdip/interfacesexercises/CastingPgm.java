package ait.hdip.interfacesexercises;

public class CastingPgm {
	
	public static void upcasting() {
		
		Triangle rightAngle = new RightAngledTriangle();
		Triangle t1 = new Triangle();
		RightAngledTriangle r1 = new RightAngledTriangle();
		t1.draw();
		r1.draw();
		t1 = r1;
		t1.draw();
		
		Shape s = new Triangle();
		//s.draw();
		
		s = r1;
	}
	
	public static void downcasting() {
		
	}

	public static void main(String[] args) {
		
		upcasting();

	}
	
	public static void progToTheInterface(Shape shape) {
		//draw();
	}
	
	

}
