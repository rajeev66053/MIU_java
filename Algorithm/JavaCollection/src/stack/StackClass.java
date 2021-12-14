package stack;
import java.util.Iterator;
import java.util.Stack;

public class StackClass {
	public static void main(String args[]){  
		Stack<String> stack = new Stack<String>();  
		stack.push("Ayush");  
		stack.push("Garvit");  
		stack.push(null);//allow any number of null value
		stack.push(null);//allow any number of null value
		stack.push("Amit");  
		stack.push("Ashish");  
		stack.push("Garima");  
		stack.pop();  
		Iterator<String> itr=stack.iterator();  
		while(itr.hasNext()){  
			System.out.println(itr.next());  
		}  
	}  
}
