import java.util.Scanner;

public class HubNetworkCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, m; 
		
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows");
        n = in.nextInt();

        System.out.println("Enter number of columns");
        m = in.nextInt();
        int[][] array = new int[n][m];

        System.out.println("Enter Values in arrays");
        for (int i=0;i<n;i++){
            for (int j=0; j<m; j++){
                array[i][j]=in.nextInt();
            }
        }
        System.out.print(hubs(array));

	}
	
	public static int hubs(int[][] array){
    	// Write your code here
    	// Return the number of hubs
    	 int network=0;

    	for(int i=1; i< array.length;i++ ){
            for (int j=1; j<array[0].length; j++){
            	
//            	System.out.println(array[0][2]);
                
                if(array[i][j]==1){
                    
                    if(!(array[i][j-1]==1 || array[i-1][j-1]==1 || array[i-1][j]==1)){
                        network++;
                    }
                }
                
            }
    	}
    	return network;
    }

}
