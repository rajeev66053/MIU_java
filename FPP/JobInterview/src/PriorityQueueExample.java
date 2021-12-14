
import java.util.*;
import java.util.Comparator;

public class PriorityQueueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator <String> sc= (s1, s2)->{
			return s1.length()-s2.length();
		};
		
		PriorityQueue<String> nq= new PriorityQueue<>(sc);
		nq.add("Lisa");
		nq.add("Homer");
		nq.add("Bart");
		nq.add("Simpson");
		nq.add("Marge");
        nq.add("Angelina");

		nq.add("Maggie");
		nq.add("Ned");
		System.out.println("*************");
		System.out.println(nq);
		System.out.println("*************");
		while(!nq.isEmpty()) {
			System.out.println(nq.poll());
		}
		
	}

}
