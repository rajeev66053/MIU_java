package seralizationDeseralization;

import java.io.Serializable;

public class Employee implements Serializable {
	   public String name;
	   public transient String address;
	   public transient int SSN;
	   public int number;
	   
	   public void mailCheck() {
	      System.out.println("Mailing a check to " + name + " " + address);
	   }
	}
