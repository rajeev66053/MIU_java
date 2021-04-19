package assignment5.prob3;

public final class Rectangle implements Shape {
	private final double width;
	private final double height;
	
	public Rectangle(double width, double height) {
		this.width=width;
		this.height=height;
	}
	
	public double getWidth() {
		 return width;
	}
	@Override
	public double computeArea() {
		return width*height;
		
	}

}
