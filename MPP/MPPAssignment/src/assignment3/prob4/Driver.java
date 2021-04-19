package assignment3.prob4;

public class Driver {

	public static void main(String[] args) {

		Property[] properties =new Property[3];
		properties[0]=new House(9000);
		properties[0].setAddress(new Address("Meadowlark Ln","Fairfield","Iowa",52556));
		properties[1]=new Condo(2);
		properties[1].setAddress(new Address("Goldfinch Ave","Fairfield","Iowa",52556));
		properties[2]=new Trailer();
		properties[2].setAddress(new Address("Granville Ave","Fairfield","Iowa",52557));
		
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
		
		 Admin.listProperties(properties);
	}
}
