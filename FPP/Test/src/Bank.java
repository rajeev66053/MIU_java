import java.util.Objects;

public class Bank {
	
	String n;
    String add;
    int an;
    int bal;
    int dep;

    public Bank(String n, String add, int an, int bal) {

        this.add = add;
        this.bal = bal;
        this.an = an;
        this.n = n;

    }
    
    public static void main(String[] args) {
    	
    	Bank b=new Bank("n","a",10,20);
    	System.out.println(b.hashCode());
    	System.out.println(b.toString());
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((add == null) ? 0 : add.hashCode());
		result = prime * result + an;
		result = prime * result + bal;
		result = prime * result + dep;
		result = prime * result + ((n == null) ? 0 : n.hashCode());
		return result;
		
//		return Objects.hash(add,an,bal,dep,n);
	}

//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Bank other = (Bank) obj;
//		if (add == null) {
//			if (other.add != null)
//				return false;
//		} else if (!add.equals(other.add))
//			return false;
//		if (an != other.an)
//			return false;
//		if (bal != other.bal)
//			return false;
//		if (dep != other.dep)
//			return false;
//		if (n == null) {
//			if (other.n != null)
//				return false;
//		} else if (!n.equals(other.n))
//			return false;
//		return true;
//	}
    
//    public String toString() {
//        return "Name of the customer.:" + this.n + ",, "
//                + "Address of the customer.:" + this.add + ",, " + "A/c no..:"
//                + this.an + ",, " + "Balance in A/c..:" + this.bal;
//    }
    
    

}
