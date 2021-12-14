import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> words=new ArrayList<String>();
	    
	    words.add("Rat");
	    words.add("Car");
	    words.add("Below");
	    words.add("Tast");
	    words.add("Cried");
	    words.add("Study");
	    words.add("Thing");
	    words.add("Chin");
	    words.add("Grab");
	    words.add("Act");
	    words.add("Robed");
	    words.add("Vase");
	    words.add("Glean");
	    words.add("Desserts");
	    words.add("Tar");
	    words.add("Arc");
	    words.add("Elbow");
	    words.add("State");
	    words.add("Cider");
	    words.add("Dusty");
	    words.add("Night");
	    words.add("Inch");
	    words.add("Brag");
	    words.add("Cat");
	    words.add("Bored");
	    words.add("Save");
	    words.add("Angel");
	    words.add("Streseed");	    
	    
	    List<List<String>> result=printAnagrams(words);
	    
	    System.out.println(result);
	}
	
	public static List<List<String>> printAnagrams(List<String> wordList) {
		
		HashMap<String, List<String> > map = new HashMap<>();
		List<List<String>> result=new ArrayList<List<String>>();		
		
		for(int i=0;i<wordList.size();i++) {
			
			String word=wordList.get(i);
			char[] letters=word.toLowerCase().toCharArray();			
			Arrays.sort(letters);
			String newWord = new String(letters);
			
			if(map.containsKey(newWord)) {
				map.get(newWord).add(word);
			}else {
				List<String> words=new ArrayList<String>();
				words.add(word);
				map.put(newWord,words);
			}			
		}
		
		for(String key:map.keySet()) {	
			
			result.add(map.get(key));			
		}
		
		return result;		
	}
}
