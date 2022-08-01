package May17th;

public class Student extends Person{
public Student(String name,String CollegeName) {
	
		super();
		this.College=College;
		// TODO Auto-generated constructor stub
	}
private String College;
private String year;
public String getCollege() {
	return College;
}
public void setCollege(String college) {
	College = college;
}
public String getYear() {
	return year;
}
public void setYear(String year) {
	this.year = year;
}

}
