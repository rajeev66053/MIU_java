package exceptions;

class Parent3{    
	  void msg() throws ArithmeticException {  
	    System.out.println("parent method");  
	  }    
	}    

public class SubClassDeclareSameException extends Parent3 {    
	  void msg()throws ArithmeticException {  //If subclass method throw same exception as parent class method exception then there will be no problem.
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]){    
		   Parent3 p = new SubClassDeclareSameException();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}    
		  }    
		}    