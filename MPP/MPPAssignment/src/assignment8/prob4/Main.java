package assignment8.prob4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	
	public static void main(String[] args) {
		
		List<String> words=Arrays.asList("book","laptop","cup","pencil","mobile","boot","hat");
		
		Main main=new Main();
		
		System.out.println(String.format("List of words that have length equal to %d, that\r\n" + 
				"contain the character %s, and that do not contain the character %s: "+ main.countWords(words, 'l','x',6),6,'l','x'));
		
	}
	
	public int countWords(List<String> words, char c, char d, int len) {
		return (int) words.stream()
				.filter(word->hasCharacter(word,c))
				.filter(word->!hasCharacter(word,d))
				.filter(word->hasLength(word,len))
				.count();
	}
	
	public boolean hasCharacter(String word, char c) {
		for (int i = 0; i < word.length(); i++) {
	         char ch = word.charAt(i);
	            if (ch==c) {
	               return true;
	            }
	      }
		return false;
	}
	
	public boolean hasLength(String word,int length) {
		
		if(word.length()==length) {
			return true;
		}
		return false;
	}

}
