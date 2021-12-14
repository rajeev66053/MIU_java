/* In Java, we can have an abstract class without any abstract method. This allows us to create classes that cannot be instantiated, but can only be inherited.*/
// An abstract class without any abstract method 
abstract class Base2 { 
	void fun() { System.out.println("Base fun() called"); } 
} 

class Derived2 extends Base2 { } 

class MainAbs2 { 
	public static void main(String args[]) { 
		Derived2 d = new Derived2(); 
		d.fun(); 
	} 
} 
