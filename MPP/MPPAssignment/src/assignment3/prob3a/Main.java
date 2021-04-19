package assignment3.prob3a;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle c=new Circle(4);
		
		System.out.println("Area of circle: "+c.computeArea());
		
		Cylinder cyd=new Cylinder(4,7);
		
		System.out.println("Volume of cylinder: "+cyd.computeVolume());

	}

}
