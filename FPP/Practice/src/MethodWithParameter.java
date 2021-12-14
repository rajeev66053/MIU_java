import java.util.Scanner;
public class MethodWithParameter {
	public static void main(String[] arg) {
		
		Scanner input=new Scanner(System.in);		
		MethodWithParameters smObject=new MethodWithParameters();
	
		System.out.println("Enter your name here:");
		String name=input.nextLine();
		
		smObject.simpleMessage(name);
		
	}

}
