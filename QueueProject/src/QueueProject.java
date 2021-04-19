import java.util.PriorityQueue;

public class QueueProject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek());//highest priority
		System.out.println();
		
		q.poll();//remove highest prioritys
		System.out.printf("%s ",q);

	}

}
