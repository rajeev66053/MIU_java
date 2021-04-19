package assignment2.prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
	private int orderNum;
	private List<OrderLine> orderLineList = new ArrayList<OrderLine>();
	
	Order(int aNum) {
		this.orderNum = aNum;
	}
	
	public void addOrderLineList(OrderLine ol) {
		orderLineList.add(ol);
	}
	
	public int getOrderNum() {
		return orderNum;
	}
	
	public String toString() {
		return "The order number is " + orderNum + "\n" + orderLineList;
	}
}
