
public class StackUsingArray {
	
	int size;
	int[] arr;
	int top;
	
	
	public StackUsingArray(int size) {
		this.size=size;
		this.arr=new int[size];
		this.top=-1;
	}
	
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top]=element;
			System.out.println("Push element is "+element);
			
		}else {
			System.out.println("Stack is Full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int pop_element= arr[top];
			top--;
			System.out.println("Poped elements is "+ pop_element);
			return pop_element;
			
		}else {
			System.out.println("Stack is Empty!");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (top==-1);
	}
	
	public boolean isFull() {
		return (top==size-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingArray stackArray=new StackUsingArray(5);
		stackArray.pop();
		System.out.println("=============================");
		stackArray.push(100);
		stackArray.push(90);
		stackArray.push(50);
		stackArray.push(75);
		System.out.println("===============================");
		stackArray.pop();

	}

}
