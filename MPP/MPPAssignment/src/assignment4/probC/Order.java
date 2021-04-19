package assignment4.probC;

import java.util.Date;

public class Order {
	private int orderNo;
	private Date orderDate;
	private double orderAmount;
	
	public Order(int aOrderNo,Date aOrderDate,double aOrderAmount) {
		this.orderNo=aOrderNo;
		this.orderDate=aOrderDate;
		this.orderAmount=aOrderAmount;
	}
	
	public int getOrderNo() {
		return orderNo;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	
	public double getOrderAmount() {
		return orderAmount;
	}
}
