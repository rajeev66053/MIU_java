import java.util.Stack;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node one = new Node("R");
        Node two = new Node("A");
        Node three = new Node("D");
        Node four = new Node("A");
        Node five = new Node("R");
        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;
        boolean condition = isPalindrome(one);
        System.out.println("isPalidrome :" + condition);

	}
	
	static boolean isPalindrome(Node head)
    {
 
        Node slow = head;
        boolean ispalin = true;
        Stack<String> stack = new Stack<String>();
 
        while (slow != null) {
            stack.push(slow.data);
            slow = slow.next;
        }
 
        while (head != null) {
 
            String i = stack.pop();
            if (head.data == i) {
                ispalin = true;
            }
            else {
                ispalin = false;
                break;
            }
            head = head.next;
        }
        return ispalin;
    }

}


class Node {
    String data;
    Node next;
    Node(String str)
    {
        next = null;
        data = str;
    }
}
