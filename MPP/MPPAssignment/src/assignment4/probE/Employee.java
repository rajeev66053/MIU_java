package assignment4.probE;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Employee {
	private String name;
	private List<Account> accounts;
	
	public Employee(String aName) {
		this.name=aName;
		this.accounts=new ArrayList<Account>();
	}
	
	public String getName() {
		return this.name;
	}
	
	public void addAccount(Account acc) {
		accounts.add(acc);
	}
	
	
	public double computeUpdatedBalanceSum() {
		//implement
		double updatedBalanceSum=0.0;
		for(Account acc:accounts) {
			updatedBalanceSum+=acc.computeUpdatedBalance();
		}
		return updatedBalanceSum;
	}
}
