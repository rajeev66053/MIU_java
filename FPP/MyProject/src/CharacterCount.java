import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="abracadabra";
		
		Map<String,Integer> map=characterCount(str);
		
		System.out.println(map);
	}
	
	public static Map<String, Integer> characterCount(String s) {
		// implement solution here
			Map<String,Integer> map=new HashMap<>();
			
			for(int i=0; i< s.length();i++) {
				String str=String.valueOf(s.charAt(i));
				
				if(map.containsKey(str)) {
					int count=map.get(str);
					map.put(str, ++count);
				}else {
					map.put(str, 1);
				}
			}
		
			return map;
		}

}
