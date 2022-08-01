package May6thand7th;

public class Customer {
//state
	private String name;
	private Address adrees;
	
	
	//caretion
	public Customer(String name, Address adrees) {
		super();
		this.name = name;
		this.adrees = adrees;
	}
	 public Address getAdrees() {
		return adrees;
	}
	public void setAdrees(Address adrees) {
		this.adrees = adrees;
	}
	public String toString() {
		return String.format("name-%s,adrees-[%s]",name,adrees);
		 
	 }
	
}
