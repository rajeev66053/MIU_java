package assignment2.prob2B;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o1;
		o1 = new Order(001);
		
		OrderLine ol= new OrderLine(543, o1);
		o1.addOrderLineList(ol);
		
		OrderLine ol2= new OrderLine(549, o1);
		o1.addOrderLineList(ol2);
		
		System.out.println(o1);
	}

}
