import java.util.HashMap;
import java.util.Map;

public class RrepeatingAndMissingNumberArray {
	
	public static void main(String[] args) {
		
		int[] arr = { 4, 3, 6, 2, 1, 1 };
		
		Map<Integer,Boolean> map= new HashMap<>();
		
		int max=Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
			if(map.containsKey(arr[i])) {

				map.put(arr[i], true);
			}else {
				map.put(arr[i], false);
			}
			
		}
		
		
		
		for(int i=1; i<=max;i++) {
			if(map.containsKey(i)) {
				if(map.get(i)==true) {
					System.out.println("Repeating "+i);
				}
			}else{
				System.out.println("Missing "+i);
			}
		}
	}

}
