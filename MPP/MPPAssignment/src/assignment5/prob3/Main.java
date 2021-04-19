package assignment5.prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Shape> shape=new ArrayList<Shape>();
		
		shape.add(new Triangle(5.5,7.5));
		shape.add(new Rectangle(3,4));
		shape.add(new Circle(4));
		
		double totalArea=0.0;
		for(Shape s:shape) {
			totalArea+=s.computeArea();
		}
		
		System.out.println("Sum of Areas: "+totalArea);

	}

}
