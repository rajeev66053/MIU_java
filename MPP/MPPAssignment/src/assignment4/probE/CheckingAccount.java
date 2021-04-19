package assignment4.probE;

public class CheckingAccount extends Account {
	private double balance;
	private double monthlyFee;
	private String accId;
	
	public CheckingAccount(String accId,double monthlyFee,double balance) {
		this.accId=accId;
		this.monthlyFee=monthlyFee;
		this.balance=balance;
	}
	
	@Override
	public String getAccountID() {
		// TODO Auto-generated method stub
		return accId;
	}
		
	public double getMonthlyFee() {
		return monthlyFee;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}

	@Override
	public double computeUpdatedBalance() {
		return balance - monthlyFee;
	}

}
