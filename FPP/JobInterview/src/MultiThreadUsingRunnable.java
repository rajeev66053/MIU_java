public class MultiThreadUsingRunnable {
	public static void main(String[] args)
    {
        int n = 8; // Number of threads
        for (int i = 0; i < n; i++) {
        	MultithreadingDemo1 mtd=new MultithreadingDemo1();
            Thread object
                = new Thread(mtd);
            object.start();
        }
    }
}

class MultithreadingDemo1 implements Runnable {
    public void run()
    {
        try {
            // Displaying the thread that is running
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running");
        }
        catch (Exception e) {
            // Throwing an exception
            System.out.println("Exception is caught");
        }
    }
}
