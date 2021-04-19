package assignment3.prob4;

public class Admin {
	public static double computeTotalRent(Property[] properties) {
		double totalRent = 0;
		for (Property p : properties) {
				totalRent += p.computeRent();			
		}
		return totalRent;
	}
	
	public static void listProperties(Property[] properties) {
		for (Property p : properties) {
			if(p.address.getCity().equals("Fairfield")) {
				System.out.println(p.toString());
			}			
	}
	}
}
