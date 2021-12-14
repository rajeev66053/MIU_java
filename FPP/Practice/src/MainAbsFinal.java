//Abstract classes can also have final methods (methods that cannot be overridden).
// An abstract class with a final method 
abstract class Base { 
	final void fun() { System.out.println("Derived fun() called"); } 
} 

class Derived extends Base {} 

class MainAbsFinal { 
	public static void main(String args[]) { 
	Base b = new Derived(); 
	b.fun(); 
	} 
} 
