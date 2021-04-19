package assignment5.prob4;

import java.time.LocalDate;

import assignment5.prob4.Customer;
import assignment5.prob4.Order;

public class Main {
	public static void main(String[] args) {
		Customer cust=CustOrderFactory.getCustomer("Bob");		
		Order order = CustOrderFactory.getOrder(cust, LocalDate.now());
		order.addItem("Shirt");
		order.addItem("Laptop");

		order = CustOrderFactory.getOrder(cust, LocalDate.now());
		order.addItem("Pants");
		order.addItem("Knife set");

		System.out.println(cust.getOrders());
	}
}

		
