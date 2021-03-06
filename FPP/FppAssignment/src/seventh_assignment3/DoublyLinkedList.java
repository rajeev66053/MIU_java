package seventh_assignment3;

public class DoublyLinkedList {
	
		Node header;
		DoublyLinkedList(){
			header = new Node();
		}
		public void addFirst(String item) {
			
			if(item==null)return;
			Node current=header;
			Node newNode=new Node();

			newNode.value=item;
			
			if(current.next==null) {
				current.next=newNode;
				newNode.previous=current;
				newNode.next=null;
			}else {

				current.next.previous=newNode;
				newNode.next=current.next;
				current.next=newNode;
				newNode.previous=current;
			}

		}
		//adds to the end of the list
		public void addLast(String item){
			//implement
			Node last=new Node();
			Node current=header;
			
			while(current.next!=null) {
				current=current.next;
				
			}

			last.value=item;
			last.previous=current;			
			current.next=last;
			last.next=null;
			
			
		}
		public boolean deleteFirst() {
			
			Node current=header;
			if(current.next!=null) {
				Node toBeRemoved=current.next;
				
				current.next=toBeRemoved.next;
				toBeRemoved.next.previous=current;
				return true;
			}
			
			return false;
		}
		public boolean deleteLast() {
			Node current=header;
			
			if(current.next==null) {
				return false;
			}
			while(current.next!=null) {
				current=current.next;
			}
			
			current.previous.next=null;
			
			return true;
		}
		
		public boolean remove(String item){

			//Implement
			if(item==null) {
				return false;
			}
			
			Node current=header.next;
			
			boolean removed=false;
			
			while(current!=null) {
				if(current.value==item) {
					current.previous.next=current.next;
					current.next.previous=current.previous;
					removed=true;
					break;					
				}

				current=current.next;
			}
		
			if(removed) {
				return true;
			}			
			
			return false;
		}
		
		public boolean isEmpty() {
			if(header.next==null) {
				return true;
			}
			return false;
		}
		
		public int size() {
			Node current=header;
			int count=0;
			while(current.next!=null) {
				current=current.next;
				count++;
			}
			return count;
		}
		
		public int find(String item) {
			Node current=header;
			int index=-1;
			int count=0;
			
			while(current.next!=null) {
				count++;
				current=current.next;
				if(current.value.equals(item)) {
					index=count;
					return index;
				}
			}
			return index;
		}
		
		@Override
		public String toString() {
			
			StringBuilder sb = new StringBuilder();
			toString(sb, header);
			return sb.toString();
			
		}
		private void toString(StringBuilder sb, Node n) {
			if(n==null) return;
			if(n.value != null) sb.append(" " + n.value);
			toString(sb, n.next);
		}
		
		class Node {
			String value;
			Node next;
			Node previous;
			
			public String toString() {
				return value == null ? null : value;
			}
		}
	
		public static void main(String[] args){
			DoublyLinkedList list = new DoublyLinkedList();
			list.addLast("Bob");
			list.addLast("Harry");
			list.addLast("Steve");
			System.out.println(list);
			System.out.println(System.lineSeparator());
			
			list.addFirst("Rajeev");
			System.out.println(list);
			
			list.deleteFirst();
			System.out.println(list);
			
			list.deleteLast();
			System.out.println(list);
			

			list.addFirst("Shyam");
			System.out.println(list);

			list.addLast("Paul");
			System.out.println(list);
			

			list.remove("Harry");
			System.out.println(list);
			
			System.out.println("Is list empty: "+list.isEmpty());

			
			int index =list.find("Bob");
			System.out.println("index of Bob:"+index);
			

			int index1 =list.find("Gopal");
			System.out.println("index of Gopal:"+index1);
		}
}
