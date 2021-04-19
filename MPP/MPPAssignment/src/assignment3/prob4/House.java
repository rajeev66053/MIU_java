package assignment3.prob4;

public class House extends Property{
	private double rent;
	private double lotSize;
	
	public House(double aLotSize) {
		this.lotSize=aLotSize;
	}
	

	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1*lotSize;
	}
	
	@Override
	public String toString() {
		return "House";
	}
	

}
