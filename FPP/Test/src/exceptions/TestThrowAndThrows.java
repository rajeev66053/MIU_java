package exceptions;


public class TestThrowAndThrows {
	 static void method()/* throws ArithmeticException*/  //Here no need to throw exception in method() function because it is already catched in catch block and it is a unchecked exception
	    {  
	        System.out.println("Inside the method()");  
	        throw new ArithmeticException("throwing ArithmeticException");  
	    }  
	    //main method  
	    public static void main(String args[])  
	    {  
	        try  
	        {  
	            method();  
	        }  
	        catch(ArithmeticException e)  
	        {  
	        	System.out.println(e.getMessage());
//	            System.out.println("caught in main() method");  
	        }  
	    }  
}
