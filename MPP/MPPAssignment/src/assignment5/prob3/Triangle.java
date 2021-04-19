package assignment5.prob3;

public final class Triangle implements Shape {
	private final double base;
	private final double height;
	
	public Triangle(double base, double height) {
		this.height=height;
		this.base=base;
	}
	
	public double getBase() {
		 return base;
	}
	
	public double getHeight() {
		 return height;
	}
	
	@Override
	public double computeArea() {
		return 0.5*base*height;
	}

}
