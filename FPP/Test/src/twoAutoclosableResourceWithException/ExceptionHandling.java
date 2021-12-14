package twoAutoclosableResourceWithException;

public class ExceptionHandling {
	
	public static void main(String[] args) throws Exception{
		Exception finalException = null;
	    try {
	        tryWithResourcesTwoResources();
	    } catch (Exception e) {
	        e.printStackTrace();
	        Throwable[] suppressed = e.getSuppressed();
	        System.out.println("suppressed = " + suppressed);
	    	
//	    	finalException = new Exception("Error...");
//	        finalException.addSuppressed(e);
//	        for(Throwable suppressed : e.getSuppressed()){
//	            finalException.addSuppressed(suppressed);
//	        }
	    } finally {
	        if(finalException != null){
	            throw finalException;
	        }
	    }
	}

	public static void tryWithResourcesTwoResources() throws Exception {
	    try(AutoClosableResource resourceOne = new AutoClosableResource("One", true);
	        AutoClosableResource resourceTwo = new AutoClosableResource("Two", true)
	    ){
	        resourceOne.doOp(true);
	        resourceTwo.doOp(false);
	    }
	}

}
