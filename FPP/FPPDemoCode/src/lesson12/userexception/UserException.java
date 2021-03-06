package lesson12.userexception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class myException extends Exception {
	myException() {
		super("Error:Password too short");
	}

	myException(int n) {
		super("Error:Only adults can register for voting" + n);
	}
}

public class UserException {

	public static void main(String[] args) throws IOException, myException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("Enter user name : ");
			String n = br.readLine();
			System.out.print("Enter your password : ");
			String m = br.readLine();
			if (m.length() < 6)
				throw new myException();
			System.out.print("Enterd your age : ");
			int o = Integer.parseInt(br.readLine());
			if (o < 18)
				throw new myException(o);
		} catch (myException e) {
			System.out.println(e.getMessage());
			System.err.println(e);
			// e.printStackTrace();
		} finally {
			System.out.println("End");
		}
	}
}
