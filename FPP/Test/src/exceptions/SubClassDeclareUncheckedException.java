package exceptions;

class Parent1{    
	  void msg() {  
	    System.out.println("parent method");  
	  }    
	}

public class SubClassDeclareUncheckedException extends Parent1{    
	  void msg()throws ArithmeticException {    //If subclass method declare unchecked exception then there is no need to throw exception in parent class method.
		    System.out.println("child method");    
		  }    
		  
		  public static void main(String args[]) {    
		   Parent1 p = new SubClassDeclareUncheckedException();    
		   p.msg();    
		  }    
		}   