package com.June4th.TreeSetMethods;

import java.util.Set;
import java.util.TreeSet;

public class SetIntetrfaceNavigatableSet {

	public static void main(String[] args) {
		TreeSet<Integer> numbers=new TreeSet<Integer>(Set.of(65,54,34,12,99));
		System.out.println(numbers);
		System.out.println(numbers.floor(40));//rerturns the number which is lessthan or Equals to 40
		System.out.println(numbers.lower(34));//returns All numbers less than 34
	System.out.println(numbers.ceiling(40));//Returns Above or equals to 40 (only one number)
		System.out.println(numbers.subSet(20, 80));//returns  values between 20 and 80
		System.out.println(numbers.subSet(34, true,65,true));//returns  values >=34 &<=65
		System.out.println(numbers.subSet(34, false,65,false));////returns  values >=34,<=65
		System.out.println(numbers.headSet(50));//returns values above 50
		System.out.println(numbers.tailSet(50));//returns values below 50
		
	}

}
