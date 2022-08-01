package com.June2.Iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveValueWithIterators {

	public static void main(String[] args) {

		
		List<String> words = List.of("John", "Dheer");// Immutable List
	   ArrayList<String> wordA1 = new ArrayList<String>(words);// Store Immutable values into ArrayList Now values are
       Iterator<String> word = wordA1.iterator();
        while(word.hasNext()) {
        	if(word.next().endsWith("er")) {
        	word.remove();
        	System.out.println(wordA1);
        	}
        }
		
	}}

//Below code using normal for loop using this we can't remove values so we need to use iterators													// mutable values
/*
 * List<String> words = List.of("John", "Dheer");// Immutable List
 * ArrayList<String> wordA1 = new ArrayList<String>(words);// Store Immutable
 * values into ArrayList Now values are // mutable values for (String w :
 * wordA1) { if (w.endsWith("eer")) { wordA1.remove(w);
 * System.out.println(wordA1); } }
 */