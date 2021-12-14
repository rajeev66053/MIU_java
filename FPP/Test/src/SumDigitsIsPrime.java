// java code to check if 
// recursive sum of 
// digits is prime or not. 
import java.io.*; 

class SumDigitsIsPrime
{ 

	// Function for recursive 
	// digit sum 
	static int recDigSum(int n) 
	{ 
		if (n == 0) 
			return 0; 
		else
		{ 
			if (n % 9 == 0) {
				return 9; 
			}else {
				return n % 9; 
			}
		} 
	} 
		
	// function to check if prime 
	// or not the single digit 
	static void check(int n) 
	{ 
		// calls function which 
		// returns sum till 
		// single digit 
		n = recDigSum(n); 
		
		// checking prime 
		if (n == 2 || n == 3 || n == 5 || n == 7) 
			System.out.println ( "Yes"); 
		else
			System.out.println("No"); 
	} 
	
	// Driver code 
	public static void main (String[] args) 
	{ 
		int n = 5602; 
		check(n); 
	
	} 
} 

// This code is contributed by vt_m 
