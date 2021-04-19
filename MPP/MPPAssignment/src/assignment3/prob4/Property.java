package assignment3.prob4;

public abstract class Property {

	protected Address address;
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	abstract double computeRent();
}
