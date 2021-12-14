// Java program to add elements 
// to a PriorityQueue 
import java.util.*; 
import java.io.*; 

public class PriorityQueueDemo1 { 

	public static void main(String args[]) 
	{ 
		PriorityQueue<String> pq = new PriorityQueue<>(); 

		pq.add("Geeks"); 
		pq.add("For"); 
		pq.add("Geeks"); 

		System.out.println(pq); 
	} 
}
