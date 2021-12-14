
public class CalculateProfit {
	
	public static void main(String[] args) {
		int[] prices= {7,5,8,1,2};
		
		int profitIndex=maxProfit(prices);
		
		System.out.println(profitIndex);
	}
	
	 public static int maxProfit(int[] prices) {
	        
		 int minPrice=Integer.MAX_VALUE;
	        int maxProfit=0;
		        
		        for(int i=0; i< prices.length; i++){
		        	
		            if(prices[i]<minPrice){
		                minPrice=prices[i];
		            }
		            
		             if(prices[i]-minPrice > maxProfit){
		                maxProfit=prices[i]-minPrice;
		            }
		            
		        }
		        
		       return maxProfit;
	    }

}
