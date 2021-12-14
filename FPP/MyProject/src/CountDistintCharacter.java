import java.util.HashSet;
import java.util.Set;

public class CountDistintCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abracadabra";
		
		int count= countDistinctCharacters(str);
		
		System.out.println(count);

	}
	
	public static int countDistinctCharacters(String s) {
		// implement solution here
		
		Set<Character> st=new HashSet<>();
				
		for(int i=0; i<s.length();i++) {
			
			st.add(s.charAt(i));
		}
		
		return st.size();
		}

}
