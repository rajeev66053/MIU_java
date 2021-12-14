package Test;

import java.util.ArrayList;

public  class Recursive1 {
	public static void main(String [] args) {
		ArrayList<int[]> result =  permute(new int[]{1, 5, 4, 2});
		for (int[] arr : result) {
			System.out.print("{");
			for (int i= 0 ; i<arr.length; i++) {
				System.out.print(arr[i]);
				if(i != arr.length -1)
				System.out.print(',');
			}
			System.out.print("}");
			System.out.println();
			
		}
		
	}
	 
	static ArrayList<int[]>  permute(int a[])
	 {
		 ArrayList<int[]> result = new ArrayList<int[]>();
	     permute(a, 0, result);
	     return result;
	 }
	
	static void permute(int a[], int i,  ArrayList<int[]> result)
	 {
		int n = a.length -1;
	     int j;
	     if (i == n)
	     {
	    	 result.add(a.clone());      
	     }
	     else
	     {
	         for (j = i; j <= n; j++)
	         {                        
	            a = swap(a, i, j);
	            permute(a, i+1,  result);
	            a = swap(a, i, j);
	         }
	     }
	 }
	static int []  swap(int a[], int i, int j) {
		int temp; 
		temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		return a;
	 }

}