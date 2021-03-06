package lesson9.stack;
import java.util.Stack;
import java.util.Vector;;
public class StackAPIDemo {

	public static void main(String[] args) {
		// Demo with Stack Methods
		Stack<Integer> stack = new Stack<Integer>();
		System.out.println("Integer Stack");
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		System.out.println("Size of the Stack :" + stack.size() + "\nCapacity = " + stack.capacity());
		System.out.println("Get index : " + stack.get(1));
		System.out.println("Place of 6 from top : " + stack.search(6));
		System.out.println("Top Element : " + stack.peek());
		stack.pop();
		System.out.println("Element of lesson9.stack : " + stack);
		System.out.println("String Array");
		Stack<String> s1 = new Stack<String>();
		s1.push("Red");
		s1.push("Blue");
		s1.push("Yellow");
		System.out.println("Place of Red from top " + s1.search("Red"));
		System.out.println("Place of Blue from top " + s1.search("Blue"));
		System.out.println("Place of Green from top " + s1.search("Green"));
		System.out.println("Item = " + s1.peek());
		s1.pop();
		s1.pop();
		s1.pop();
		//System.out.println("Element of s1" + s1.peek()); // Throws Exception if the lesson9.stack is empty
				
	}
	
}
