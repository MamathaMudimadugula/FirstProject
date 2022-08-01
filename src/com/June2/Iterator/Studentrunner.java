package com.June2.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Studentrunner {

	public static void main(String[] args) {
	 List<student> st=List.of(new student(2,"Mam"),new student(1,"m"),new student(120,"a"));
	 System.out.println(st);
ArrayList<student> st1=new ArrayList<>(st);
Collections.sort(st1);//in student class we have written Implemets Comapre (compare used to compare 2 students)
System.out.println(st1);
	}

}
