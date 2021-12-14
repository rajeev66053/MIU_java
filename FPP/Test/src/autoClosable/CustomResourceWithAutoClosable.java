package autoClosable;

public class CustomResourceWithAutoClosable {
	
	public static void main(String[] args) throws Exception {
		CustomResourceWithAutoClosable custom= new CustomResourceWithAutoClosable();
		custom.orderOfClosingResources();
	}
	
	private void orderOfClosingResources() throws Exception {
	    try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
	        AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

	        af.doSomething();
	        as.doSomething();
	    }
	}

}
