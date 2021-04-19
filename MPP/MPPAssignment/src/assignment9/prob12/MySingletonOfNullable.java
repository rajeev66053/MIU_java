package assignment9.prob12;

public class MySingletonOfNullable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < 10; ++i) {
			MySingletonLazy.getInstance();
		}
		
		System.out.println(MySingletonLazy.count);

	}

}
