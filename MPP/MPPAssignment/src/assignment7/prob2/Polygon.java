package assignment7.prob2;

public interface Polygon extends ClosedCurve {
	
	double[] getSides();
	
	default double computePerimeter() {
		double perimeter=0;
		for(double side: this.getSides()) {
			perimeter+=side;
		}
		return perimeter;
	}
	
}
