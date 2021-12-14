import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=9;
		
		String roman=intToRoman(num);
		
		System.out.println(roman);

	}
	
	public static String intToRoman(int num) {
		
		Map<Integer,Character> roman=new HashMap<>();
	     
	     roman.put(1,'I');
	     roman.put(5,'V');
	     roman.put(10,'X');
	     roman.put(50,'L');
	     roman.put(100,'C');
	     roman.put(500,'D');
	     roman.put(1000,'M');
		
		return "";
        
    }

}
