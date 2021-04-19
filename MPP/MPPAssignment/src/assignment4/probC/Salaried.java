package assignment4.probC;

public class Salaried extends Employee {
	
	public double salary;
	
	public Salaried(int aEmpId,double aSalary) {
		super(aEmpId);
		this.salary=aSalary;
	}
	
	@Override
	public double calcGrossPay(int aMonth,int aYear) {
		return (aYear*12+aMonth)*salary;
	}
}
