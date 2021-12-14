
public class MyClass{

	public static void main(String[] args){
		
		int number=22456;
		
		int isEven=isEvens(number);
		//System.out.println(isEven);

		if(isEven ==1){
			System.out.printf(" %d is even number.",number);
		}else{
			System.out.printf(" %d isnot even number.",number);
		}
	}

	public static int isEvens(int n){
		int remainder=0; int return_value=0;
		
		if(n<0){
			n=-n;
		}

		
		
		while(n>0){					

			remainder=n%10;			

			if(!remainder%2){
				return_value=0;
				break;

			}

			n=n/10;

			if(n==0){
				return_value=1;
			}

			

		}
		return return_value;
	}


}