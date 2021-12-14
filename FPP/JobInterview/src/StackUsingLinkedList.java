
public class StackUsingLinkedList {
	
	private Node header;
	
	class Node{
		int data;
		Node next;
		
	}
	
	public StackUsingLinkedList() {
		header=new Node();
	}
	
	public void push(int data) {
		
		Node current=header;
		while(current.next!=null) {
			current=current.next;
		}
		
		Node newNode=new Node();
		newNode.data=data;
		
		current.next=newNode;
	}
	
	public int pop(){
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		
		Node current=header.next;
		Node newTop=header;
		
		while(current.next!=null) {
			newTop=current;
			current=current.next;
		}
		 int item=current.data;
		 
		 newTop.next=null;
		
		return item;
	}
	
	public int peek(){
		
		if(isEmpty()) {
			System.out.println("Stack is empty");
			return -1;
		}
		
		
		Node current=header.next;
		
		while(current.next!=null) {
			current=current.next;
		}		 
		
		return current.data;
	}
	
	
	
	public boolean isEmpty() {
		Node current=header;
		if(current.next==null) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackUsingLinkedList sll=new StackUsingLinkedList();
		sll.push(200);
        sll.push(150);
        sll.push(80);
        sll.push(90);
        sll.push(600);
        sll.push(175);
        
        System.out.println("Removed element from LinkedList: "+sll.pop());
        System.out.println("Removed element from LinkedList: "+sll.peek());

	}

}