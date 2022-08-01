package com.June3rd.SetInterface;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetRunner {

	public static void main(String[] args) {
		List<Character> charecters=List.of('A','E','A','z','B','f');
		 //Sorted Order
		 Set<Character> tree=new TreeSet<>(charecters);
		 System.out.println("tree"+tree);
		 //
		 Set<Character> linked=new LinkedHashSet<>(charecters);
		 System.out.println("linked"+linked);
		 //
			
			  Set<Character> hashSet=new HashSet<>(charecters);
			  System.out.println("hashSet"+hashSet);
			 
	}

}
