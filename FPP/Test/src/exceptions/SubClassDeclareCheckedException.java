package exceptions;

import java.io.IOException;

class Parent{   
  
  // defining the method   
  void msg() throws IOException {  //If child class method throw checked exception then parent class method must throw same or higher exception otherwise it will throw error.
    System.out.println("parent method");  
    }    
}

public class SubClassDeclareCheckedException extends Parent{    
	  
	  // overriding the method in child class  
	  // gives compile time error  
	  void msg() throws IOException {    
	    System.out.println("TestExceptionChild");    
	  }  
	  
	  public static void main(String args[]) throws IOException {    
	   Parent p = new SubClassDeclareCheckedException();    
	   p.msg();    
	  }    
	}    
