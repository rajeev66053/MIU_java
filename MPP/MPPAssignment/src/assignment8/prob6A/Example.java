package assignment8.prob6A;

import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee e=new Employee("Rajeev",4000);
		
		Function<Employee, String> getName=(emp) -> emp.getName();
		Function<Employee,String> getName1=Employee::getName;
		//Method reference type: Class::instanceMethod

		BiConsumer<Employee,String> setName=(emp,s) -> emp.setName(s);
		BiConsumer<Employee,String> setName1=Employee::setName;
		//Method reference type: Class::instanceMethod
		
		Comparator<String> strComp =(s1,s2)-> s1.compareTo(s2);
		Comparator<String> strComp1 =String::compareTo;
		//Method reference type: Class::Instance Method of an Arbitrary Object of a Particular Type
		
		BiFunction<Integer,Integer,Double> mathPow=(x,y) -> Math.pow(x,y);
		BiFunction<Integer,Integer,Double> mathPow1=Math::pow;
		//Method reference type: Class::staticMethod
		
		Function<Apple,Double> getWeight=a -> a.getWeight();
		Function<Apple,Double> getWeight1=Apple::getWeight;
		//Method reference type: Class::instanceMethod
		
		Function<String,Integer> stringToInteger=(x) -> Integer.parseInt(x);
		Function<String,Integer> stringToInteger1=Integer::parseInt;
		//Method reference type: Class::staticMethod
		
		
		EmployeeNameComparator comp = new EmployeeNameComparator();
		Comparator<Employee> empComp1=(e1, e2) -> comp.compare(e1,e2);
		Comparator<Employee> empComp2=comp::compare;
		//Method reference type: Class::instanceMethod
		
		


	}

}
