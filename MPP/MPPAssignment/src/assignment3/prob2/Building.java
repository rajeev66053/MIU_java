package assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
	private int buildingId;
	private List<Apartment> apt;
	private double profit;
	private double rent;
	private double maintainanceCost;
	
	public Building(int aBuildingId, double aMaintainanceCost) {
		apt=new ArrayList<Apartment>();
		this.buildingId=aBuildingId;
		this.maintainanceCost=aMaintainanceCost;
	}
	
	public void addApartment(Apartment a) {
		apt.add(a);
	}
	
	public double getBuildingRent() {
		double totalAptRent=0.0;
		for(Apartment a:apt) {
			totalAptRent+=a.getRent();
		}
		
		return totalAptRent;
	}
	public double getBuildingId() {
		return this.buildingId;
	}
	
	public double getMaintainanceCost() {
		return this.maintainanceCost;
	}
	
	public double getProfit() {
		return getBuildingRent()-maintainanceCost;
	}

}
