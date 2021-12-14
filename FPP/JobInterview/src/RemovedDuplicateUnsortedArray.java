import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class RemovedDuplicateUnsortedArray {
	
	public static void main(String[] args) {
		int[] arr = { 4, 1, 2, 5, 1, 7, 2,  2 };
        int n = arr.length;
        removeDups(arr, n);
	}
	
	public static void removeDups(int[] arr, int length) {
		
		Set<Integer> st= new HashSet<Integer>();
		
		Hashtable<Integer,Integer> ht= new Hashtable<>();
		int count=0;
		for(int i=0; i<length; i++) {
			st.add(arr[i]);
			if(ht.containsKey(arr[i])) {

				ht.put(arr[i], ++count);
			}else {
				ht.put(arr[i], 1);
			}
		}
		
		System.out.println(st);
		
		
		
	}

}
