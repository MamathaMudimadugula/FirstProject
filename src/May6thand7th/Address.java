package May6thand7th;

public class Address {
	//state
 private String line1;
 private String homeAddress;
 private String workAddress;
 
 
 
 //Craetion
 public Address(String line1, String homeAddress, String workAddress) {
	super();
	this.line1 = line1;
	this.homeAddress = homeAddress;
	this.workAddress = workAddress;
}
 

public String getLine1() {
	return line1;
}

public void setLine1(String line1) {
	this.line1 = line1;
}

public String getHomeAddress() {
	return homeAddress;
}

public void setHomeAddress(String homeAddress) {
	this.homeAddress = homeAddress;
}

public String getWorkAddress() {
	return workAddress;
}

public void setWorkAddress(String workAddress) {
	this.workAddress = workAddress;
}


public String toString() {
		return String.format("line1-%s,homeAddress-%s,workAddress-%s",line1,homeAddress,workAddress);
}}