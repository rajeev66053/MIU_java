import java.time.Duration;
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

public class Fibbonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Instant start = Instant.now();
		System.out.println(start);
		int n=10;
		
		System.out.println("Fibbonacci Series upto 10 using recursion ");
		
		for(int i=0; i< n; i++) {

			System.out.print(fibboReccursion(i)+ " ");
		}
		Instant finish = Instant.now();
		System.out.println(finish);
		
		System.out.println("Duration "+Duration.between(start, finish).toNanos());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		start = Instant.now();
		System.out.println(start);
		
		System.out.println("");
		System.out.println("Fibbonacci Series upto 10 using map ");
		
		for(int i=0; i< n; i++) {

			System.out.print(fibboMap(i)+ " ");
		}
		
		finish = Instant.now();
		System.out.println(finish);
		
		System.out.println("Duration "+Duration.between(start, finish).toNanos());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		start = Instant.now();
		System.out.println(start);
		System.out.println("Fibbonacci Series upto 10 using for loop ");
		
		int fib0=0;
		int fib1=1;
		int sum;
		
		for(int i=0; i<n; i++) {
			if(i<2) {
				System.out.print(i+ " ");
			}else {
			sum= fib0+fib1;
			fib0=fib1;
			fib1=sum;
			System.out.print(sum+ " ");
			}
		}
		finish = Instant.now();
		System.out.println(finish);
		
		System.out.println("Duration "+Duration.between(start, finish).toNanos());

	}
	
	public static int fibboReccursion(int n) {
		
//		int fib0=0;
//		int fib1=1;
		
		if(n<2) {
			return n;
		}
		
		return fibboReccursion(n-2)+fibboReccursion(n-1);
	}
	
	public static int fibboMap(int n) {		
		
		
			Map<Integer,Integer> map = new HashMap<>();
			
			map.put(0, 0);
			map.put(1, 1);
			
			if(map.containsKey(n)) {
				return map.get(n);
			}else {
				map.put(n, fibboMap(n-2)+fibboMap(n-1));
			}
			
			return map.get(n);
		}
}
