package May3rdRefacorArraytoArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;
	private ArrayList<Integer> marks = new ArrayList<Integer>();

	public Student(String name, int... marks) {
		this.name = name;

		for (

		int mark : marks) {
			this.marks.add(mark);
		}
	}

	public int getNumberOfMarks() {

		return marks.size();

	}

	public int gettotalSum() {
		int sum = 0;
		for (int mark : marks) {
			sum += mark;

		}
		return sum;
	}

	public int getMaximumNumber() {

		return Collections.max(marks);
	}

	public int getMinimumNumber() {
		return Collections.min(marks);
	}

	public BigDecimal getBigDecimal() {

		int number = getNumberOfMarks();
		int sum = gettotalSum();
		return new BigDecimal(sum).divide(new BigDecimal(number), 4, RoundingMode.UP);
	}

	public String toString() {
		return name + marks;
	}

	public void addNewMark(int mark) {
		marks.add(mark);
	}

	public void removeMark(int index) {
		marks.remove(index);
	}
}