package linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list= Arrays.asList("Rat","car","tar","arc","Vase","save","end","den","eat","ate","tea","one","neo","eno");
		
		List<List<String>>anagrams=checkAnagrams(list);
		
		System.out.println(anagrams);

	}
	
	public static List<List<String>> checkAnagrams(List<String> list) {	
		
		
		Map<String,List<String>> map=new HashMap<>();
		
		for(String word: list) {
			
			char[] c=word.toLowerCase().toCharArray();
			
			Arrays.sort(c);
			
			String sortedtext= new String(c);
			
			if(map.containsKey(sortedtext)) {
				map.get(sortedtext).add(word);
			}else {
				List<String> anagram= new ArrayList<>();
				anagram.add(word);
				map.put(sortedtext, anagram);
			}
		}
		
		List<List<String>> anagramList= new ArrayList<>();
		for(Map.Entry entry:map.entrySet()) {
			anagramList.add((List<String>) entry.getValue());			
			
		}		
		
		return anagramList;
		
	}

}
