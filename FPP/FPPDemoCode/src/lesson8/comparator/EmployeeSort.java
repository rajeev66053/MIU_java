package lesson8.comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmployeeSort {
	public static void main(String[] args) {
		new EmployeeSort();
	}

	public EmployeeSort() {
		Employee[] empArray = { new Employee("George", 1996, 11, 5),
				new Employee("Dave", 2000, 1, 3),
				new Employee("Richard", 2001, 2, 7) };
		
		
		List<Employee> empList =  Arrays.asList(empArray);
		
		/*Employee e1=new Employee("George", 1996, 11, 5);
		Employee e2=new Employee("Dave", 2000, 1, 3);
		Employee e3=new Employee("Richard", 2001, 2, 7);

		List<Employee> empList =  Arrays.asList(e1,e2,e3);*/
		
		
		Comparator<Employee> nameComp = new NameComparator1();
		Collections.sort(empList, nameComp);
		System.out.println(empList.toString());
	}
}
