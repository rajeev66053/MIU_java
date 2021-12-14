
public class PalindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x=121;
		
		System.out.println(isPalindrome(x));
	}
	
	public static boolean isPalindrome(int x) {
		
			int sign = 1;
	        if( x < 0 ) sign = -1;
		
			int originalValue=x;
	        
	        int reversedNum=0;
	        
	        while(x!=0){
	            int rem=x%10;
	            reversedNum=reversedNum*10+rem;
	            x=x/10;  
	            
	        }
	        
	        if(originalValue==(reversedNum * sign)){
	            return true;
	        }else{
	            return false;
	        }
	        
	    }
	
	}
