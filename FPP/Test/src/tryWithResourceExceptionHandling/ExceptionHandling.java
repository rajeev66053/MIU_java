package tryWithResourceExceptionHandling;

public class ExceptionHandling {
	
	public static void main(String[] args){
	    try {
	        tryWithResourcesSingleResource();
	    } catch (Exception e) {
	        e.printStackTrace();
	        Throwable[] suppressed = e.getSuppressed();
	    }
	}

	public static void tryWithResourcesSingleResource() throws Exception {
	    try(AutoClosableResource resourceOne = new AutoClosableResource("One", false)) {
	        resourceOne.doOp(false);
	    }
	}

}
