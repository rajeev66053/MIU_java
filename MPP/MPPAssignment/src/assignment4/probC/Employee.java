package assignment4.probC;

import java.time.Month;
import java.time.Year;

public abstract class Employee {
	
	protected int empId;
	
	public Employee(int aEmpId) {
		this.empId=aEmpId;
	}
	
	public int getEmpId() {
		return empId;
	}
	
	public void print() {
		System.out.println("Employee Id is: " + empId);
	}
	
	public Paycheck calcCompensation(int aMonth,int ayear) {
		double grossPay=calcGrossPay(aMonth,ayear);
		Paycheck pc=new Paycheck(grossPay, 23, 5, 1, 3, 7.5);
		return pc;
	}
	
	public abstract double calcGrossPay(int aMonth,int ayear);

}
