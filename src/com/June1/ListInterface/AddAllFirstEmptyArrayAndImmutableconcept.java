package com.June1.ListInterface;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class AddAllFirstEmptyArrayAndImmutableconcept {

	public static void main(String[] args) {
		 ArrayList<String> array=new ArrayList<String>();//First iam Creating one Empty ArrayList[]
			
		List<String> newList = List.of("Laxmi","Lingaiah");//Using Immutablity List I am Assigning Names into Emoty Array List 
	array.addAll(newList);//addAll will add Everything in Array
System.out.println(array);
	}

}
