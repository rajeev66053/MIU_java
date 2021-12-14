class Department1 implements Cloneable{
	String empId;

	String grade;

	String designation;

	public Department1(String empId, String grade, String designation) {
		this.empId = empId;

		this.grade = grade;

		this.designation = designation;
	}
	//Default version of clone() method.
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

class Employee1 implements Cloneable {
	int id;

	String name;

	Department1 dept;

	public Employee1(int id, String name, Department1 dept) {
		this.id = id;

		this.name = name;

		this.dept = dept;
	}

	// Overriding clone() method to create a deep copy of an object.

	protected Object clone() throws CloneNotSupportedException {
		Employee1 emp = (Employee1) super.clone();

		emp.dept = (Department1) dept.clone();

		return emp;
	}
}
public class DeepCopyExample {

	public static void main(String[] args) {
		Department1 dept1 = new Department1("1", "A", "AVP");

		Employee1 emp1 = new Employee1(111, "John", dept1);

		Employee1 emp2 = null;

		try {
			// Creating a clone of emp1 and assigning it to emp2

			emp2 = (Employee1) emp1.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

		// Printing the designation of 'emp1'

		System.out.println(emp1.dept.designation); // Output : AVP

		// Changing the designation of 'emp2'

		emp2.dept.designation = "Director";

		// This change will be reflected in original Employee 'emp1'

		System.out.println(emp2.dept.designation); // Output : AVP

		System.out.println(emp1.dept.designation); // Output : AVP
	}
}
