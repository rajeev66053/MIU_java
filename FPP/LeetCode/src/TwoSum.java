import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,7,11,15};
		int target=9;
		int[] result=twoSum(nums,target);
		
		System.out.println(Arrays.toString(result));

	}
	
public static int[] twoSum(int[] nums, int target) {
        
        Map<Integer,Integer> numMap=new HashMap<>();
        for(int i=0; i<nums.length;i++){
            numMap.put(nums[i],i);
        }
        
        for(int j=0;j<nums.length;j++){
            int diffValue=target - nums[j];
            if(numMap.containsKey(diffValue) && numMap.get(diffValue)!=j){
               return new int[]{j,numMap.get(diffValue)};
            }            
        }
        
        throw new IllegalArgumentException("No two sum solution.");
        
    }

}
