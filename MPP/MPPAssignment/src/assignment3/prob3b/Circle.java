package assignment3.prob3b;

public class Circle {
	private double radius;
	
	public Circle(double aRadius) {
		this.radius=aRadius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI*Math.pow(radius, 2);
	}
}
