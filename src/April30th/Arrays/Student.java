package April30th.Arrays;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

public class Student {

	private Object name;
	private int[] marks;

	public Student(String string, int[] marks) {
		this.name = name;
		this.marks = marks;

	}

	public int getNumberOfMarks() {

		return marks.length;

	}

	public int gettotalSum() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;

		}
		return sum;
	}

	public int getMaximumNumber() {
		int maximum =Integer.MIN_VALUE;
		for(int mark : marks) {
			if(mark>maximum) {
				maximum=mark;
			}
		}
		return maximum;
	}

	public int getMinimumNumber() {
		int minimum = Integer.MAX_VALUE;
		for(int mark : marks) {
			if(mark<minimum) {
				minimum=mark;
			}
		}
		return minimum;
	}

	public BigDecimal getBigDecimal() {

		int number = getNumberOfMarks();
		int sum = gettotalSum();
		return new BigDecimal(sum).divide(new BigDecimal(number),4,RoundingMode.UP);
	}
}
	
