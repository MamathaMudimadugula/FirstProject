package com.June1.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ListandArrayList {
	public static void main(String[] args) {
		basicForLoop() ;
		//below is the ADVANCED FORLOOP
		/*
		 * List<Integer> words = List.of(1, 2, 3, 4);
		 * 
		 * 
		 * for (Integer word : words) { // System.out.print(word+",");
		 * System.out.println(word); }
		 */

	}
	
	
	public static void basicForLoop() {
		List<Integer> words = List.of(1, 2, 3, 4);
		for (int i=0;i<=words.size();i++) {
			
			System.out.println(words.get(i));
		}
	}
	
	
	
	

}