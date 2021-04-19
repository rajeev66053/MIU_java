import java.util.Stack;

public class StackPushPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>();
		stack.push("bottom");
		printStack(stack);
		stack.push("second");
		printStack(stack);
		stack.push("third");
		printStack(stack);
		
		
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
		stack.pop();
		printStack(stack);
	}
	
	private static void printStack(Stack<String> s) {
		if(s.isEmpty()) {
			System.out.println("You have nothing in the stack");
			
		}else {
			System.out.printf("%s TOP\n",s);
		}
	}


}
