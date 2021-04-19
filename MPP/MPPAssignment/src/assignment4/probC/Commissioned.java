package assignment4.probC;

import java.time.Month;
import java.time.Year;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Commissioned extends Employee {
	
	private double commission;
	private double baseSalary;
	private List<Order> orders;
	
	public Commissioned(int aEmpId,double abaseSalary,double aCommission) {
		super(aEmpId);
		this.baseSalary=abaseSalary;
		this.commission=aCommission;
		this.orders=new ArrayList<Order>();
	}
	
	public void addOrder(int aOrderNo,Date aDate,double aOrderAmount) {
		this.orders.add(new Order(aOrderNo,aDate,aOrderAmount));
	}
	
	public double getCommission() {
		double netOrder = 0;
		for(Order o: orders) {
			netOrder += o.getOrderAmount();
		}
		
		return netOrder*commission;
	}
	
	

	@Override
	public double calcGrossPay(int aMonth,int aYear) {
		return (aMonth+12*aYear)*baseSalary + getCommission();
	}


}
