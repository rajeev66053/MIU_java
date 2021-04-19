package assignment2.prob2B;

public class OrderLine {
	private int orderLineNumber;
	private Order order;
	OrderLine(int num, Order order){
		this.orderLineNumber = num;
		this.order = order;
	}
	
	public int getOrderNumber() {
		return order.getOrderNum();
	}
	
	public String toString() {
		return "This order line is " + orderLineNumber;
	}

}