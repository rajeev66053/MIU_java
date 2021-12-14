package staticInnerClass;

public class StaticOuterClass {
	static int data=30;  
	static class Inner{  
		void msg(){System.out.println("data inside non static method is "+data);}  
		static void display() {
			System.out.println("data inside static method is "+data);
		}
	}  
	
	public static void main(String args[]){    
		StaticOuterClass.Inner.display(); //No need to create the instance of inner class because display method is static
		StaticOuterClass.Inner obj=new StaticOuterClass.Inner();  //Need to create the instance of inner class because msg method is non static.
		obj.msg();
	}  
}
