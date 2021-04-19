package assignment4.probE;

public class SavingsAccount extends Account {
	private double balance;
	private double interestRate;
	private String accId;
	
	public SavingsAccount(String accId,double interestRate,double balance) {
		this.accId=accId;
		this.interestRate=interestRate;
		this.balance=balance;
	}
	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}
		
	public double getInterestRate() {
		return interestRate;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		// TODO Auto-generated method stub
		return balance + (interestRate * balance);
	}
}
