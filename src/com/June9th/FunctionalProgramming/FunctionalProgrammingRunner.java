package com.June9th.FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	
	public static void main(String[] args) {
		
		List<String> list=List.of("Appple","bat","Cat","Dog");
		
		PrintObjectOrientedProgramming(list);
		
		PrintFunctionalProgramming(list);
		
		}
	

//Object-oriented-programming-use loops//Immutable
	private static void PrintObjectOrientedProgramming(List<String> list) {
		
		for(String string:list) {
			
			System.out.println(string);
			
		}
		
	}
	
	//functional -Programming Uses Recursion//Mutable
	private static void PrintFunctionalProgramming(List<String> list) {
		
		list.stream().forEach(
				
				element->System.out.println(element)
				
				);
		}
	}
