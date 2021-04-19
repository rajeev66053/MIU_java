package assignment3.prob3a;

public class Circle extends Cylinder{
	private double radius;
	
	public Circle(double aRadius) {
		super(aRadius,0);
		this.radius=aRadius;
	}
	
	public double getRadius() {
		return this.radius;
	}
	
	public double computeArea() {
		return Math.PI*Math.pow(radius, 2);
	}

}
