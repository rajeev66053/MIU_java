import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="MCMXCIV";
		
		System.out.println(romanToInt(s));
	}
	
public static int romanToInt(String s) {
        
	 Map<Character,Integer> roman=new HashMap<>();
     
     roman.put('I',1);
     roman.put('V',5);
     roman.put('X',10);
     roman.put('L',50);
     roman.put('C',100);
     roman.put('D',500);
     roman.put('M',1000);
        
        int output=0;
        
        for(int i=0; i<s.length(); i++){   
        	
            if(i!=s.length()-1 && roman.get(s.charAt(i)) < roman.get(s.charAt(i+1))) {
            	output+=roman.get(s.charAt(i+1))-roman.get(s.charAt(i));
            	i++;
            }else {
            	output+=roman.get(s.charAt(i));
            }
             
        }
        
        return output;
        
    }

}
