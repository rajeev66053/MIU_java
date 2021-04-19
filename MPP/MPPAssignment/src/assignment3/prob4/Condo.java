package assignment3.prob4;

public class Condo extends Property{
	private double rent;
	private int numFloors;
	
	public Condo(int aNumFloors) {
		this.numFloors=aNumFloors;
	}
	public double computeRent() {
		// TODO Auto-generated method stub
		return 400*numFloors;
	}
	@Override
	public String toString() {
		return "Condo";
	}
}
