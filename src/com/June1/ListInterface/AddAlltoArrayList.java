package com.June1.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class AddAlltoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> array = new ArrayList<String>();// First iam Creating one Empty ArrayList[]
		array.add("Ramya");// adding values to Empty arraylist
		array.add("Mamatha");
		List<String> newList = List.of("Laxmi", "Lingaiah");// Using Immutablity List I am Assigning Names into Emoty
															// Array List
		array.addAll(0, newList);// addAll will add Everything in Array
		//System.out.println(array);
		array.set(3,"Durgam");// puting the string value to particular index
		System.out.println(array);
	}

}