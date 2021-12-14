import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Map< Integer, String> map=new HashMap<Integer, String>();
		
		map.put(101, "Hemendra");
		map.put(99, "Andrew");
		map.put(103, "Anish");
		map.put(18, "Mohan");
		map.put(11, "Christine");
		map.put(109, "Rebeca");
		map.put(111, "David");
		map.put(19, "Rahim");
		map.put(10, "Krishna");
		map.put(1001, "Krishna");
		
		 Map<Integer,String> sortedMap = sortByValue(map);
		 
		 System.out.println(sortedMap);
		
	}
	
	public static Map<Integer,String> sortByValue(Map<Integer,String> map){
		
		List<Map.Entry<Integer,String>> list = new LinkedList<Map.Entry<Integer,String>>(map.entrySet());
		
		Collections.sort(list, new Comparator<Map.Entry<Integer,String>>(){

			@Override
			public int compare(Map.Entry<Integer, String> o1, Map.Entry<Integer, String> o2) {
				// For decending Order
				return (o2.getValue().length() - o1.getValue().length());
				//For ascending Order
				//return (o1.getValue().length() - o2.getValue().length());
			}
			
		});
		
		Map<Integer,String> temp = new LinkedHashMap<Integer,String>();
	        for (Map.Entry<Integer,String> aa : list) {
	            temp.put(aa.getKey(), aa.getValue());
	        }
	        return temp;
		
	}

}
