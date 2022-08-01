package May17th;

public class Employee extends Person{
	
	public Employee(String name) {
		super();
		System.out.println("Employee Constructor");
	}
	private String title;
	private String employerName;
	private char employeeGrade;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getEmployeeGrade() {
		return employeeGrade;
	}
	public void setEmployeeGrade(char employeeGrade) {
		this.employeeGrade = employeeGrade;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	private int salary;
	
	public String toString() {
		//return employerName+" # "+employeeGrade+ " # "+salary+" # "+super.getEmail();
		return  super.toString()+employerName+" # "+employeeGrade+ " # "+salary+" # ";
		
	}
}
