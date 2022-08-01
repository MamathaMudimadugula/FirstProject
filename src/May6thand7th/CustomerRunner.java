package May6thand7th;

public class CustomerRunner {

	public static void main(String[] args) {
		Address homeAddrees=new Address("Sramikanagar","m-1","Mncl");
		Customer customer =new Customer("Mamatha", homeAddrees);
System.out.println(customer);
Address workAddrees=new Address("hyd","m-1","hyd");
customer.setAdrees(workAddrees);
System.out.println(customer);
	}

}
