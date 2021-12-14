package fourth_assignment5;

public class Person implements Cloneable { 
	
	String name;

	Computer computer;

	public Person(String name, Computer computer) { 
		super();

		this.name = name; 
		this.computer = computer;
	}

	protected Object clone() throws CloneNotSupportedException { 
		
//		For shallow clone
//		return super.clone();
		
		//For Deep clone
		
		Person person = (Person) super.clone();
		
		person.computer=(Computer) computer.clone();
		
		return person;

	}

	@Override

	public String toString() {

		return "Person [Name=" + name + ", Computer=" + computer + "]";

	}

}
