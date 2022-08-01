package May16th;

public class StudentRunner {

	public static void main(String[] args) {
		StudentPerson();
		Employee();
	}

	public static void StudentPerson() {
		Student student = new Student();
		
		student.setName("sharath");
		student.setEmail("123@gmail.com");
		System.out.println(student);

		Person person = new Person();
		
		person.setEmail("ajbagshdhd");
		person.setName("xyz");
		// String value = person.toString();
		// System.out.println(value);
		
		System.out.println(person);

	}

	public static void Employee() {

		Employee employee = new Employee();
		employee.setEmail(" employee@gmail.com");
		employee.setName("sdhhbsadh");
		employee.setEmployeeGrade('A');
		employee.setEmployerName("Manju");
		employee.setSalary(1200);
		System.out.println(employee);

	}
}
