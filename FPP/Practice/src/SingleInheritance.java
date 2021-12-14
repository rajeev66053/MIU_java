//Java program to illustrate the 
// concept of single inheritance 
import java.util.*; 
import java.lang.*; 
import java.io.*; 

class one2 
{ 
	public void print_geek() 
	{ 
		System.out.println("Geeks"); 
	} 
} 

class two2 extends one2 
{ 
	public void print_for() 
	{ 
		System.out.println("for"); 
	} 
} 
// Driver class 
public class SingleInheritance
{ 
	public static void main(String[] args) 
	{ 
		two2 g = new two2(); 
		g.print_geek(); 
		g.print_for(); 
		g.print_geek(); 
	} 
} 
