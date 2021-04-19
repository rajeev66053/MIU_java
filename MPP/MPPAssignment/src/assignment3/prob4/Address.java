package assignment3.prob4;

public class Address {
	private String street;
	private String city;
	private String state;
	private int zip;
	
	public Address(String aStreet,String aCity,String aState,int aZip) {
		this.street=aStreet;
		this.city=aCity;
		this.state=aState;
		this.zip=aZip;
	}
	
	public String getStreet() {
		return this.street;
	}
	public String getCity() {
		return this.city;
	}
	public String getState() {
		return this.state;
	}
	public int getZip() {
		return this.zip;
	}
	

}
