package com.June2.Iterator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomePuzzles {

	public static void main(String[] args) {
 List word=List.of("A",'A',1,1.0);//we can print in 1 List All data type int,string,double,char
	System.out.println(word);// It will print word object values
	System.out.println(word.get(2) instanceof Integer);//Here we are checking at index 2 integer is present or not (Instance of datatype) 
	
	System.out.println(word.indexOf("A"));//It will print index of particular value
	
	
	
	List<Integer> word1=List.of(103,105,101,102);
	ArrayList<Integer> word2=new ArrayList<Integer>(word1);
	word2.remove(Integer.valueOf(101));//for remove 1 value from ArrayList
			System.out.println(word2);
			
			Collections.sort(word2);//For Sorting 
			System.out.println(word2);
	}

}
