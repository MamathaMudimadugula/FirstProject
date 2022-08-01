package com.June9th.FunctionalProgramming;

import java.util.List;

public class Fliter {

	public static void main(String[] args) {
		
		List<String> list=List.of("Appple","bat","Cat","Dog");
		
		
	

	//functional -Programming Uses Recursion//Mutable

		
		list.stream()
		.filter(
				element->element.endsWith("at")
				)
		.forEach(
				element->System.out.println(element)
				);
		
		
	}}