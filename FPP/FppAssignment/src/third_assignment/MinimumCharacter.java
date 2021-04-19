package third_assignment;

import java.util.Scanner;

public class MinimumCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string in lower case only :");
		String userInput=sc.nextLine();
		System.out.printf("Mimimum character of string %s is %s",userInput,minCharacter(userInput));
		sc.close();

	}
	
	public static Character minCharacter(String userInput) {
		
		if(userInput==null||userInput.length()==0) {
			return null;
		}
		
		if(userInput.length()==1) {
			return userInput.charAt(0);
		}

		return (userInput.charAt(0)<minCharacter(userInput.substring(1)))?userInput.charAt(0):minCharacter(userInput.substring(1));
		
	}

}
