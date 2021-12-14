package tryWithResource;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class MultipleResource {
	public static void main(String[] args) throws IOException {
		MultipleResource.printFile();
	}
	
	private static void printFile() throws IOException {

	    try(  FileInputStream     input         = new FileInputStream("file.txt");
	          BufferedInputStream bufferedInput = new BufferedInputStream(input)
	    ) {

	        int data = bufferedInput.read();
	        while(data != -1){
	            System.out.print((char) data);
	            data = bufferedInput.read();
	        }
	    }
	}
}
