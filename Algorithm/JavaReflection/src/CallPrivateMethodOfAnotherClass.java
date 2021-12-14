import java.lang.reflect.Method;

class A {  
  private void message(){System.out.println("hello java"); }  
}  

class B{  
private void cube(int n){System.out.println(n*n*n);}  
}  

public class CallPrivateMethodOfAnotherClass {
	public static void main(String[] args)throws Exception{  

		Class c = Class.forName("A");  
		Object o= c.newInstance();  
		Method m =c.getDeclaredMethod("message", null);  
		m.setAccessible(true);  
		m.invoke(o, null); 
		
		Class c1=B.class;  
		Object c1Obj=c1.newInstance();  
		  
		Method m1=c1.getDeclaredMethod("cube",new Class[]{int.class});  
		m1.setAccessible(true);  
		m1.invoke(c1Obj,4);
	}  
}
