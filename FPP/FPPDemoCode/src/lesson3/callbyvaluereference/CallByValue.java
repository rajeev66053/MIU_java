package lesson3.callbyvaluereference;

class Test {
	/*
	 * This method causes no change to the arguments used in the call.
	 */
	void noChange(int a, int b) { // Formal arguments
		a = a + b;
		b = -b;
	}
}
public class CallByValue {
	public static void main(String[] args) {
		Test ob = new Test();
		int a = 15, b = 20;
		System.out.println("a and b before call: " + a + " " + b);
		ob.noChange(a, b); // Actual Arguments
		System.out.println("a and b after call: " + a + " " + b);

	}

}
