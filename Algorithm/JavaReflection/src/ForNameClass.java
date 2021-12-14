class Simple{}    

public class ForNameClass{    
	public static void main(String args[]) throws Exception {    
		Class c=Class.forName("Simple");    
		System.out.println(c.getName());    
	}    
}
