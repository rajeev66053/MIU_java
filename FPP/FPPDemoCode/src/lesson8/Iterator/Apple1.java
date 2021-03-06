package lesson8.Iterator;

import java.util.Objects;

public class Apple1 {
	// Instance Variable
	private String color;
	private double wt;
	private double price;
	
	// Various Constructors
	public Apple1(){ // Default Constructor
		this.color = "Red"; // this indicates current object
		this.wt=0.450;
		this.price = 1.2;
	}
  // Parameterized Constructor
	public Apple1(String color, double wt,double price){
		this.color = color;
		this.wt = wt;
		this.price = price;
	}
	
	// Getters and Setters
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getWt() {
		return wt;
	}
	public void setWt(double wt) {
		this.wt = wt;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	// Display the current status of object
	
	@Override
	public String toString(){
		return  color + " " + wt + " " + price;
	}
	 @Override
	   public boolean equals(Object ob) {
		   // Are they same
		   if(this==ob) return true;
		   // The object is null return false
		   if(ob==null) return false;
		   if(this.getClass()!=ob.getClass()) return false;
		   // Convert the argument in to Apple type
		   Apple1 a = (Apple1) ob;
		   if(this.color.equals(a.color) && this.wt==a.wt && this.price == a.price)
			   return true;
		   else
			   return false;
	   }
	@Override
	   public int hashCode() {
		   
		    return Objects.hash(color,wt,price);
	   }
	
}
