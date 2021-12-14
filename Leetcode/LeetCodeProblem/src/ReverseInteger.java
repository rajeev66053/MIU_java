

public class ReverseInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=524;
		
		int reversedNum=reverse(x);
		System.out.println(reversedNum);
		

	}
	
	 public static int reverse(int x) {
		 
		 	int sign = 1;
	        if( x < 0 ) sign = -1;
	        
	        int reversedNum=0;
	        
	        while(x!=0){
	            int rem= x%10;                 
	            x=x/10;     
	            if (reversedNum > Integer.MAX_VALUE/10 || (reversedNum == Integer.MAX_VALUE / 10 && rem > 7)) return 0;
	            if (reversedNum < Integer.MIN_VALUE/10 || (reversedNum == Integer.MIN_VALUE / 10 && rem < -8)) return 0;

	            reversedNum=reversedNum*10+rem; 
	        }
	        
	        return reversedNum;
	    }

}
