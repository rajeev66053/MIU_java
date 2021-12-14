import java.util.HashMap;
import java.util.Map;

public class DistinctCountCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String str="apple";
			
			System.out.println(countCharacter(str));

	}
	
	public static Map<Character,Integer> countCharacter(String str) {
		
		char[] c= str.toCharArray();
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0; i< c.length; i++) {
			
			
			if(map.containsKey(c[i])) {
				map.put(c[i], map.get(c[i])+1);
			}else {
				map.put(c[i],1);
			}
			
		}
		
		return map;
		
//		System.out.println(map);
		
	}

}
