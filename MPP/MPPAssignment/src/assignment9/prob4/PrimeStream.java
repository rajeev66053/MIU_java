package assignment9.prob4;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrimeStream {
	
	final  Stream<Integer> primes=Stream.iterate(2,n->getPrimeNumber(n));
	
	Function<Integer, Stream<Integer>> primeNumbers=(limit)->Stream.iterate(2,n->getPrimeNumber(n)).limit(limit);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);
		
	}
	
	public void printFirstNPrimes(long n){
		
		System.out.println(primeNumbers.apply((int) n).collect(Collectors.toList()));
		
	}
	
	public Stream<Integer> getPrimeStream(){
		
		Stream<Integer> prime=primes;
		return prime;
	}
	
	public int getPrimeNumber(int N) {
		
		// Base case  
        if (N <= 1) { 
            return 2;  
        }
      
        int prime = N;  
        boolean found = false;
        while (!found)  
        {  
            prime++;  
      
            if (isPrime(prime))  
                found = true;  
        }  
      
        return prime;  
	}
	
	 static boolean isPrime(int n)  
	    {  
		    boolean flag = true;
	          
	        for (int i = 2; i <= n / 2; ++i) {
	            // condition for nonprime number
	            if (n % i == 0) {
	              flag = false;

	              break;
	            }
	          }
	        return flag;
	    }
	
	
}
