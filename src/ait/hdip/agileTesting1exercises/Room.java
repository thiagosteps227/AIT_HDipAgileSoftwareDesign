package ait.hdip.agileTesting1exercises;

public class Room {
	
	private double width;
	private double length;
	
	public Room(double width, double length) {
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public double calculateArea() {
		double area = length*width;
		return area;
	}
	
	public double calculatePerimeter() {
		double perimeter = (2*length) + (2*width);
		return perimeter;
	}
	
	
}
