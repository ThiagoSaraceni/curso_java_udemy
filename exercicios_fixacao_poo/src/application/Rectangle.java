package application;

public class Rectangle {
	public double widht;
	public double height;
	
	public double area() {
		double area = widht * height;
		return area;
	}
	
	public double perimeter() {
		double perimeter = 2*(widht + height);
		return perimeter;
	}
	
	public double diagonal() {
		double diagonal = Math.pow(widht, 2) + Math.pow(height, 2);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
	}
}
