package assignment3.prob2;

import java.util.ArrayList;
import java.util.List;

public class LandlordInfo {
	private List<Building> bldg;
	
	public LandlordInfo() {
		bldg=new ArrayList<Building>();
	}
	
	public void addBuilding(Building b) {
		bldg.add(b);
	}
	
	public double calcProfits() {
		double totalProfit=0.0;
		
		for(Building b:bldg) {
			totalProfit+=b.getProfit();
		}
		
		return totalProfit;
	}

}
