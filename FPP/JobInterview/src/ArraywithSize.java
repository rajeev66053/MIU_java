import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArraywithSize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {5, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int[][] queries = {{1, 1}, {1, 2}, {2, 1}, {2, 2}};
		
		List<Integer> arrList = IntStream.of(arr)
                .boxed().collect(Collectors.toList());
//                .toArray(Integer[]::new);
		
		List<List<Integer>> queryList=Arrays.stream(queries)
         .map(e -> IntStream.of(e).boxed().collect(Collectors.toList()))
         .collect(Collectors.toList());
		
		
		List<Integer> result=getElements(arrList,queryList);
		System.out.println(result);

	}


	public static List<Integer> getElements(List<Integer> arr,List<List<Integer>> queries) {
		// Write your code here\

		int col= arr.get(0);
		int row= (arr.size()-1)/col;
		



		Map<List<Integer>,Integer> hm=new HashMap<>();

		for(int i=1; i<=row; i++){
			for(int j= 1; j<=col;j++){

				List<Integer> list=new ArrayList<>();
				list.add(i);
				list.add(j);
				

				int value=Integer.MIN_VALUE;

				if(i==1){
					int index=j;
					value=arr.get(index);
				}else{
					int index=5+j;
					value=arr.get(index);
				}
				

				hm.put(list,value);

			}

		}
		
		List<Integer> result=new ArrayList<>();

		for(List<Integer>lt:queries ){

			if(hm.containsKey(lt)){
				result.add(hm.get(lt));
			}

		}

		return result;
	}


}
