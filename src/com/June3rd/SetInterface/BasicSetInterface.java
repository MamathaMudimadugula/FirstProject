package com.June3rd.SetInterface;

import java.util.HashSet;
import java.util.Set;

public class BasicSetInterface {

	public static void main(String[] args) {
		
		BasicProg();
		
	}
	
		public static void BasicProg(){
		Set<String> set=Set.of("A","B");//Syntax
		System.out.println(set);
		Set<String> hashset=new HashSet<String>(set);
		System.out.println(hashset);
		hashset.add("A");//we can't add same name into set (Can't add Duplicates)
		System.out.println(hashset);
		hashset.add("C");//Adding different value
		System.out.println(hashset);
		hashset.remove("A");//remove existing value
		System.out.println(hashset);
				}
}

