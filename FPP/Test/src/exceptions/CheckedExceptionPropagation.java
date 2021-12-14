package exceptions;

import java.io.File;
import java.io.IOException;

public class CheckedExceptionPropagation {
	
	void m() throws IOException{  
		throw new IOException("device error");//checked exception
	}  
	void n() throws IOException{  
		m();  
	}  
	void p(){  
		try{  
			n();  
		}catch(Exception e){System.out.println("exception handelled");}  
	}  
	public static void main(String args[]){  
		CheckedExceptionPropagation obj=new CheckedExceptionPropagation();  
		obj.p();  
		System.out.println("normal flow");  
	}  

}
