package assignment8.prob6B;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Example exp=new Example();
		
		exp.evaluator();
		
	}
				
//		Function<Employee, String> getName=(emp) -> emp.getName();
		Function<Employee,String> getName1=Employee::getName;
		//Method reference type: Class::instanceMethod


//		BiConsumer<Employee,String> setName=(emp,s) -> emp.setName(s);
		BiConsumer<Employee,String> setName1=Employee::setName;
		//Method reference type: Class::instanceMethod

		
//		BiFunction<String, String,Integer> compareString=(s1,s2)-> s1.compareTo(s2);
		BiFunction<String, String,Integer> compareString1=String::compareTo;
		//Method reference type: Class::Instance Method of an Arbitrary Object of a Particular Type
		

//		BiFunction<Integer,Integer,Double> mathPow=(x,y) -> Math.pow(x,y);
		BiFunction<Integer,Integer,Double> mathPow1=Math::pow;
		//Method reference type: Class::staticMethod
		
		
//		Function<Apple,Double> getWeight=(a) -> a.getWeight();
		Function<Apple,Double> getWeight1=Apple::getWeight;
		//Method reference type: Class::instanceMethod
		
		
//		Function<String,Integer> stringToInteger=(x) -> Integer.parseInt(x);
		Function<String,Integer> stringToInteger1=Integer::parseInt;
		//Method reference type: Class::staticMethod
		
		
		EmployeeNameComparator comp = new EmployeeNameComparator();
//		BiFunction<Employee,Employee,Integer> comapreEmployee=(e1, e2) -> comp.compare(e1,e2);
		BiFunction<Employee,Employee,Integer> comapreEmployee1=comp::compare;
		//Method reference type: Obj::instanceMethod
		
		
		public void evaluator() {
			Employee e=new Employee("Rajeev",4000);
			Employee e1=new Employee("Rajeev",2500);
			Apple a=new Apple(12.5);
			

			System.out.println(getName1.apply(e));

			setName1.accept(e, "Saroj");
			
			System.out.println(getName1.apply(e));
			
			System.out.println(compareString1.apply("Apple", "Employee"));

			System.out.println(mathPow1.apply(3, 2));

			System.out.println(getWeight1.apply(a));

			System.out.println(stringToInteger1.apply("5"));

			System.out.println(comapreEmployee1.apply(e, e1));
		}
		
		
	
}
