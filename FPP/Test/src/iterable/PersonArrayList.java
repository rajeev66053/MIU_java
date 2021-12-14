package iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonArrayList implements Iterable<Person> {

	private List<Person> persons;
	private static final int MIN_AGE = 10;
	
	public PersonArrayList() {
		persons = new ArrayList<Person>(MIN_AGE);
	}
	public PersonArrayList(int age) {
		persons = new ArrayList<Person>(age);
	}
	public void addPerson(Person p) {
		persons.add(p);
	}
	public void removePerson(Person p) {
		persons.remove(p);
	}
	public int age() {
		return persons.size();
	}
	
	@Override
	public Iterator<Person> iterator() {
		// TODO Auto-generated method stub
		return persons.iterator();
	}
	
	public static void main(String[] args) {
		Person p1 = new Person("Adithya", "Sai", 20);
		Person p2 = new Person("Jai","Dev", 30);
		PersonArrayList pList = new PersonArrayList();
		pList.addPerson(p1);
		pList.addPerson(p2);
		//Using enhanced for loop
		for (Person person : pList) {
			System.out.println(person);
		}
		
		//using iterator
//		Iterator<Person> p= pList.iterator();
//		
//		while(p.hasNext()) {
//			System.out.println(p.next());
//			
//		}
		//using forEach using Lamda Expression
//		pList.forEach(System.out::println);
	}
	

}
