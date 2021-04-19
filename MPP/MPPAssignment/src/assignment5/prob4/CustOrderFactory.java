package assignment5.prob4;

import java.time.LocalDate;

public final class CustOrderFactory {
	
	private CustOrderFactory() {
	}
	
	public static Customer getCustomer(String name) {
		return new Customer(name);
	}
	
	public static Order getOrder(Customer cust,LocalDate date) {
		return Order.newOrder(cust, LocalDate.now());
	}

}
