import java.util.Arrays;

public class LongestNonRepeatingSubString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="dvdf";
		
		String str="asdfeasd";

		int result=lengthOfLongestSubstring(str);

		System.out.println(result);
	}


	public static int lengthOfLongestSubstring(String s) {

//		String result="";
//		String subString="";
//
//
//		for(int i=0; i<s.length();i++) {
//
//			String c=String.valueOf(s.charAt(i));			
//
//			if(subString.indexOf(c)!=-1) {
//				if(result.length()<subString.length()) {
//					result=subString;
//				}
//				subString=subString.substring(subString.indexOf(c)+1);
//			}
//			subString +=c;			
//		}
//		if(result.length()<subString.length()) {
//			result=subString;
//		}
		
		int result=-1;
		String substring="";
		 char[] ch= s.toCharArray();
		
		for(int i=0; i< s.length(); i++) {
			if(substring.indexOf(ch[i])!=-1) {
				substring=substring.substring(substring.indexOf(ch[i])+1);
			}
			substring+=ch[i];
		}
		result=substring.length();

		return result;
	}


}
