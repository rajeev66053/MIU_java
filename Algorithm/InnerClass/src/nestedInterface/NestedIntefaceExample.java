package nestedInterface;

interface Showable{  
	void show();  
	interface Message{  
		void msg();  
	}  
}

public class NestedIntefaceExample implements Showable.Message{ 
	@Override
	public void msg() {
		// TODO Auto-generated method stub
		System.out.println("Hello nested interface");
	}
	public static void main(String args[]){  
		Showable.Message message=new NestedIntefaceExample();//upcasting here  
//		message.msg();  
	}

	  
}  