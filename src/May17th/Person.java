package May17th;

public class Person extends Object{

	private String name;
	private int phone;
	private String email;
	public String getName() {
		return name;
	}
	public Person() {
		super();
		System.out.println("Person Constructor");
		this.name=name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	/*
	 * public String toString() { return getClass().getName() + "#" +
	 * Integer.toHexString(hashCode()); }
	 */
	public String toString() {
		return name+"#"+email+ "#";
		
	}

}