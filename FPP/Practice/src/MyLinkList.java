
public class MyLinkList<T> {
	private Node header;
	
	public MyLinkList() {
		header= new Node(null);
	}

	void add(T ob) {
		if(ob==null) return;
		var newNode= new Node(ob);
		if(header.next==null) {
			header.next= newNode;
		}
		else {
			var nextNode= header.next;			
			while(nextNode.next!=null) {
				
				nextNode= nextNode.next;
			}
			nextNode.next= newNode;
		}
	}

	boolean find(T ob) {
		if(ob==null || header.next==null) return false;
		
		var nextNode= header.next;			
		while(nextNode.next!=null) {
			if(nextNode.data.equals(ob)) return true;
			nextNode= nextNode.next;
		}
		return false;
	}
	@Override
	public String toString()
	{
		var sb = new StringBuilder();
		sb.append("[");
		var nextNode= header.next;			
		while(nextNode.next!=null) {
			sb.append(nextNode.data);
			nextNode= nextNode.next;
			sb.append(",");
			
		}
		sb.setLength(sb.length() - 1);
		sb.append("]");
		return sb.toString();
	}

	class Node{
		T data;
		Node next;
		public Node( T data) {
			this.data= data;
		}
		
	}
}