import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class ReadFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader reader = null;		
		
		try {
			reader= new BufferedReader(new FileReader("E:\\java_workspace\\FPP\\JobInterview\\src\\word.txt"));
			String line= reader.readLine();
			
			Set<String> wordSet= new HashSet<>();
			Set<String> phraseSet= new HashSet<>();
			
			while(line!=null) {
				
				String[] words= line.trim().split(" ");
				
				if(words.length>1) {
					phraseSet.add(line.trim());					
				}else {
					wordSet.add(line.trim());	
				}
				line= reader.readLine();
			}

			reader.close();
			
			Set<String> wordResult=wordSet.stream().sorted(new Comparator<String>() {
			    @Override
			    public int compare(String s1, String s2) {
			    	if(s1.length() != s2.length()) {
			    		return s1.length() - s2.length();
			    	}
			    	return s1.compareTo(s2);
			    }
			}).collect(Collectors.toSet());
			
			Set<String> phraseResult=phraseSet.stream().sorted(new Comparator<String>() {
			    @Override
			    public int compare(String s1, String s2) {
			    	if(s1.length() != s2.length()) {
			    		return s1.length() - s2.length();
			    	}
			    	return s1.compareTo(s2);
			    }
			}).collect(Collectors.toSet());
			
			System.out.println(wordResult);			
			System.out.println(phraseResult);
			
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		
		
		

	}
	

}
