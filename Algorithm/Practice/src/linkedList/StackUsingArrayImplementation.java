package linkedList;

import java.util.Arrays;

public class StackUsingArrayImplementation {
	
	int[] a;
	int top;
	public StackUsingArrayImplementation(int size) {
		a=new int[size];
		top=-1;
	}
	
	public void push(int element) {
		if(isFull()) {
			System.out.println("stack is full");
		}else {
			a[++top]=element;
			System.out.println(element +" is pushed in stack");
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is empty");
		}else {
			System.out.println("The top element on the stack is "+a[top]);
		}
	}
	
	public void pop() {
		if(top==-1) {
			System.out.println("Stack is empty");
		}else {
			System.out.println(a[top]+ " is pop out from stack.");
			top--;
		}
	}
	
	public boolean isEmpty() {
		return top==-1;
	}
	
	public boolean isFull() {
		return top==a.length-1;
	}
	
	public void show() {
		System.out.println(Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArrayImplementation stack =new StackUsingArrayImplementation(5);
		stack.push(20);
		stack.push(10);
		stack.push(15);
		stack.push(25);
		stack.push(5);
		stack.show();
		stack.peek();
		stack.pop();
		stack.peek();
		
		

	}

}
