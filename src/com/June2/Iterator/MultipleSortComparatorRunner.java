package com.June2.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class DesendingStudentComparator implements Comparator<student>{

@Override
public int compare(student student1, student student2) {
	
	return Integer.compare(student1.getId(), student1.getId());
}
}	
public class MultipleSortComparatorRunner  {

	public static void main(String[] args) {
		
			 List<student> st=List.of(new student(2,"Mam")
					 ,new student(1,"m"),new student(120,"a"));
			 System.out.println(st);
		ArrayList<student> st1=new ArrayList<>(st);
		Collections.sort(st1);//in student class we have written Implemets Comapre (compare used to compare 2 students)
		System.out.println("Asc"+st1);
		Collections.sort(st1,new DesendingStudentComparator());
		System.out.println("DesendingStudentComparator"+ st1);
			}
}



