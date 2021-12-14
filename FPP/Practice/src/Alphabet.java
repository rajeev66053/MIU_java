public class Alphabet {

    public static void main(String[] args) {

        char c = '*';
        
        if(Character.isAlphabetic(c)) {
        	System.out.println(c + " is an alphabet.");
        }else {
        	System.out.println(c + " is not an alphabet.");
        }

//        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
//            System.out.println(c + " is an alphabet.");
//        else
//            System.out.println(c + " is not an alphabet.");
    }
}