package assignment7.prob2;

public final class Rectangle implements Polygon {

	
	final private double[] sides=new double[4];

	public Rectangle(double width, double length) {	
		this.sides[0] = this.sides[2]=width;
		this.sides[1] = this.sides[3]=length;
	}
	
	
	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return sides;
	}
}

