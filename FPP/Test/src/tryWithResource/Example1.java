package tryWithResource;

import java.io.FileInputStream;
import java.io.IOException;

public class Example1 {
	
	public static void main(String[] args) throws IOException {
		Example1.printFile();
	}
	
	private static void printFile() throws IOException {
	    FileInputStream input = new FileInputStream("file.txt");
	    try(input) {

	        int data = input.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = input.read();
	        }
	    }
	}

}
