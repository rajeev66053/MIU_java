package assignment10.prob6;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class MultiThreadedTest {
	private static Executor exec = Executors.newCachedThreadPool();
	public static void main(String[] args) {	
		MultiThreadedTest mtt = new MultiThreadedTest();
		for(int i = 0; i < 10; ++i) {
			mtt.multipleCalls();
		}
		//sleep(200);

		System.out.println("Number of elements in the queue: " + mtt.q.countElements());
	}

	
	final static QueueSynch q = new QueueSynch();
	static Runnable r = () -> {	
		
		for(int i=0;i<10;i++) {
			q.add(i);
		}
		
		for(int j=0;j<5;j++) {
			q.remove();
		}
	};
	
	
	
	public static void multipleCalls() {
		
		
		for(int i = 0; i < 100; ++i) {
			exec.execute(r);		
		}
		try {
			Thread.sleep(10);
		} catch(InterruptedException e) {}
	}
}
