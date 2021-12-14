
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="a!!!b.c.d,e'f,ghi";
		
		System.out.println("original String "+str);
		
		
		reverse(str);

	}
	
	public static void reverse(String str) {
		
		char[] c= str.toCharArray();
		int start=0;
		int end= c.length-1;
		
		
		while(start < end) {
			
			
			if(!(c[start] >='a' && c[start] <='z')) {
				start++;
			}
			
			if(!(c[end] >='a' && c[end] <='z')) {
				end--;
			}
			
			
			if((c[start] >'A' && c[start] <'z') && (c[end] >'A' && c[end] <'z')) {
			
				char temp= c[start];
				c[start]=c[end];
				c[end]=temp;
				start++;
				end--;
			}
			
		}
		
		String newString= new String(c);
		
		System.out.println("Result String :"+ newString);
		
		
		
	}

}
