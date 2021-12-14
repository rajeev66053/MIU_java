package exceptions;

class Parent2{    
	void msg()throws ArithmeticException {  
		System.out.println("parent method");  
	}    
}  

public class SubClassDeclareParentException  extends Parent2{    
	void msg() /*throws Exception */{  //If subclass method throw higher exception than parent class method exception it will throw error.
		System.out.println("child method");  
	}    

	public static void main(String args[]) {    
		Parent2 p = new SubClassDeclareParentException();    

		try {    
			p.msg();    
		}  
		catch (Exception e){}   

	}    
}     
