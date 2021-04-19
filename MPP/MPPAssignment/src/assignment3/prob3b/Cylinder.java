package assignment3.prob3b;

public class Cylinder {
	private Circle circle;
	private double height;
	private double radius;
	
	public Cylinder(double aHeight,double aRadius) {
		this.height=aHeight;
		this.radius=aRadius;
	}
	
	public double getHeight() {
		return this.height;
	}
	public double computeVolume() {
		return circle.computeArea()*height;
	}

}
