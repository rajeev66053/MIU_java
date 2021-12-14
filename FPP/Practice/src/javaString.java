
public class javaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myString="Hello World";
		int myStringLength=myString.length();
		String myStringLower=myString.toLowerCase();
		String myStringUpper=myString.toUpperCase();
		
		System.out.println(myStringLength);
		System.out.println(myStringLower);
		System.out.println(myStringUpper);
		
		System.out.println(myString.replace('e', 'a'));
		System.out.println(myString.indexOf('o'));
		System.out.println(myString.indexOf('0'));

	}

}
