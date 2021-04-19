package assignment4.probC;

import java.time.Month;
import java.time.Year;

public class Hourly extends Employee {
	
	public double hourlyWage;
	public int hoursPerWeek;
	
	public Hourly(int aEmpId,double aHourlyWage,int aHoursPerWeek) {
		super(aEmpId);
		this.hourlyWage=aHourlyWage;
		this.hoursPerWeek=aHoursPerWeek;
	}
	
	@Override
	public double calcGrossPay(int aMonth,int aYear) {
		int totalHoursWorked = (aMonth + aYear*12)*4*hoursPerWeek;
		return hourlyWage*totalHoursWorked;
	}
}
