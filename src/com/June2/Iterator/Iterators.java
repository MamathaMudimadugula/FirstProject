package com.June2.Iterator;

import java.util.Iterator;
import java.util.List;

public class Iterators {

	public static void main(String[] args) {

		List<String> words = List.of("John", "Dheer");//Immutable List 

		Iterator wordsIterator = words.iterator();// Syntax Iterator
		// Iterator used for only While Loop
		while (wordsIterator.hasNext())// hasNext() method is one of the iteration Method in interface used for return
										// true ad all values present in it

		{

			System.out.println(wordsIterator.next());// next() method is used to give the All next values present in
														// list if you don't use next() method we won't get output
		}

	}

}
