package April30th.Arrays;

import java.math.BigDecimal;

public class StudentRunner {

	public static void main(String[] args) {
		int[] marks = {1,9,20,3};
		Student student =new Student("Mamatha",marks);
		
int number=student.getNumberOfMarks();
System.out.println("number of marks :" +number);

int sum=student.gettotalSum();
System.out.println("sum is :" +sum);

int maximum=student.getMaximumNumber();
System.out.println("maximum is :" +maximum);

int minimum=student.getMinimumNumber();
System.out.println("minimum is :" +minimum);

BigDecimal average = student.getBigDecimal();
System.out.println("average is :" +average);
	}

}
