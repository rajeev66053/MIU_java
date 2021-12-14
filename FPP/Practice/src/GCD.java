public class GCD {

    public static void main(String[] args) {

//        int n1 = 81, n2 = 153, gcd = 1;
//
//        for(int i = 1; i <= n1 && i <= n2; ++i)
//        {
//            // Checks if i is factor of both integers
//            if(n1 % i==0 && n2 % i==0)
//                gcd = i;
//        }
//
//        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
    	
    	int num1 = 55, num2 = 121;

        while (num1 != num2) {
        	if(num1 > num2) {
                num1 = num1 - num2;
        	}else {
                num2 = num2 - num1;
        	}
        }

        System.out.printf("GCD of given numbers is: %d", num2);
    }
}