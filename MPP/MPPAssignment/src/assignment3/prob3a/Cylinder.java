package assignment3.prob3a;

public class Cylinder{
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
		return Math.PI*Math.pow(radius, 2)*height;
	}
}
