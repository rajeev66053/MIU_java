/*Like C++, in Java, an instance of an abstract class cannot be created, we can have references of abstract class type though.*/

abstract class Base2 { 
	abstract void fun(); 
} 
class Derived2 extends Base2 { 
	void fun() { System.out.println("Derived fun() called"); } 
} 
class MainAbs { 
	public static void main(String args[]) { 
	
		// Uncommenting the following line will cause compiler error as the 
		// line tries to create an instance of abstract class. 
		// Base b = new Base(); 

		// We can have references of Base type. 
		Base2 b = new Derived2(); 
		b.fun(); 
	} 
} 
