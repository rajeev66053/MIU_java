package assignment3.prob1;

public class PersonWithJob {
	
	private double salary;
	private Person person;
	
	public double getSalary() {
		return salary;
	}
	public PersonWithJob(String n, double s) {		
		this.person=new Person(n);
		salary = s;
	}
	public Person getPerson() {
		return person;
	}
			
	@Override
	public boolean equals(Object aPerson) {
		if(aPerson == null) return false;
//		if(this.person.getClass()!=aPerson.getClass()) return false;

		boolean isEqual=false;
		if(aPerson instanceof Person){
			Person p = (Person)aPerson;
			isEqual = this.getPerson().getName().equals(p.getName());
		}else if(aPerson instanceof PersonWithJob){
			PersonWithJob p = (PersonWithJob)aPerson;
			isEqual = this.getPerson().getName().equals(p.getPerson().getName());
		}

		return isEqual;
	}
	public static void main(String[] args) {
		PersonWithJob p1 = new PersonWithJob("Joe", 30000);
		Person p2 = new Person("Joe");
		
		
		//As PersonsWithJobs, p1 should be equal to p2
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}


}
