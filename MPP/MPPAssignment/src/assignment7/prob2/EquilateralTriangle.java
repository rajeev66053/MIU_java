package assignment7.prob2;

public final class EquilateralTriangle implements Polygon {
	
	final private double[] sides=new double[3];
	
	public EquilateralTriangle(double side) {
		this.sides[0]=this.sides[1]=this.sides[2]=side;
	}
	
	@Override
	public double[] getSides() {
		// TODO Auto-generated method stub
		return sides;
	}
}
