import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=" ";
				
		int result=lengthOfLongestSubstring(str);
		
		System.out.println(result);

	}
	
	public static int lengthOfLongestSubstring(String s) {
		
		String result="";
		String subString="";
		
		
		for(int i=0; i<s.length();i++) {
			
			String c=String.valueOf(s.charAt(i));			
			
			if(subString.indexOf(c)!=-1) {
				if(result.length()<subString.length()) {
					result=subString;
				}
				subString=subString.substring(subString.indexOf(c)+1);
			}
			subString +=c;			
		}
		if(result.length()<subString.length()) {
			result=subString;
		}
		
        return result.length();
    }

}
