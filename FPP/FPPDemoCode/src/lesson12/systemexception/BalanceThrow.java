package lesson12.systemexception;

public class BalanceThrow {
	public static void main(String[] args) {
		int balance = 10000, withdraw = 1000; 
		if (balance < withdraw) 
		{ 
		UnsupportedOperationException e = new UnsupportedOperationException("No money, Sorry");
		throw e; 
	//	throw new UnsupportedOperationException("No money, Sorry");
		} else
		 System.out.println("Draw Money & enjoy, Best wishes of the day");
		System.out.println("Hava a Good Day");
		}

	}
