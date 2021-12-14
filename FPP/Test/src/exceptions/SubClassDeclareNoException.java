package exceptions;

class Parent5 {    
	  void msg()throws Exception{  
	    System.out.println("parent method");  
	  }    
	}

public class SubClassDeclareNoException extends Parent5{    
	  void msg() {  //If parent class method throw exception then childclass method doesnot need to throw exception. Parent class method exception will work.
		    System.out.println("child method");  
		  }    
		    
		  public static void main(String args[]){    
		   Parent5 p = new SubClassDeclareNoException();    
		     
		   try {    
		   p.msg();    
		   }  
		   catch(Exception e) {}  
		       
		  }    
		}     