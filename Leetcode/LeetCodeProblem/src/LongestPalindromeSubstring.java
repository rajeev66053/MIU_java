
public class LongestPalindromeSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="aacabdkacaa";
		
		String result=longestPalindrome(str);
		
		System.out.println(result);

	}
	
	public static String longestPalindrome(String s) {
		
		String result="";
		String subString="";
		
		boolean palindromeFound=false;
		
		for(int i=0; i<s.length();i++) {
			
			String c=String.valueOf(s.charAt(i));			
			
			if(subString.indexOf(c)!=-1) {
				subString +=c;
				int k=subString.length();
				boolean palindrome=true;
				for(int j=subString.indexOf(c),m=k;j<m;j++,m--) {
					if(subString.charAt(j)!=subString.charAt(m-1)) {
						palindrome=false;
						break;
					}
				}
				if(palindrome) {
					palindromeFound=true;
					result=subString.substring(subString.indexOf(c));
				}
				
			}else {

				subString +=c;
			}			
		}

		if(!palindromeFound && subString.length()<=1) {
			result=subString;
		}
		
		if(!palindromeFound) {
			result=String.valueOf(subString.charAt(0));
		}

        return result;
    }

}
