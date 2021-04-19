package assignment4.probC;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hourly h1=new Hourly(1,40,20);
		Salaried s1=new Salaried(2,4000);
		Commissioned c1=new Commissioned(3,4500,10);
		c1.addOrder(101,new Date(),1000);
		c1.addOrder(102,new Date(),1200);
		c1.addOrder(103,new Date(),1300);
		
		Employee[] emp= {h1,s1,c1};
		
		for(Employee e:emp) {
			System.out.println("Paycheck amount for Employee "+ e.getEmpId() + " is: " + (e.calcCompensation(4, 0).getNetPay()));
		}

	}

}
