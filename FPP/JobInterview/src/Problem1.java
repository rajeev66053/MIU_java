import java.util.ArrayList;
import java.util.List;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {1,6,8,5,9,4,7,2};
		
		int count=1;
		List<Integer> result=new ArrayList<>();
		
		int sum=0;		
		int index=0;
		
		for(int i=0; i<arr.length;i++) {
			sum+=arr[i];			
			if(index+1==count || i==arr.length-1) {
				result.add(sum);
				sum=0;
				index++;
				count=1;
			}else {
				count++;
			}
		}
		
		System.out.println(result);

	}

}
