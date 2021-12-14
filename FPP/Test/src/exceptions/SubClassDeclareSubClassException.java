package exceptions;

class Parent4{    
	  void msg()throws Exception {  
	    System.out.println("parent method");  
	  }    
	}    

public class SubClassDeclareSubClassException extends Parent4{    
	  void msg()throws ArithmeticException {  //If subclass method throw lower exception as parent class method exception then there will be no problem.
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]){    
		   Parent4 p = new SubClassDeclareSubClassException();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}    
		  }    
		}    