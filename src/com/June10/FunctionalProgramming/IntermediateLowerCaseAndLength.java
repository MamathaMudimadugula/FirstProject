package com.June10.FunctionalProgramming;

import java.util.List;

public class IntermediateLowerCaseAndLength {

	public static void main(String[] args) {
		List<String> list=List.of("Apple","Bat","bat","catr","Cat");
		//conver all the List elements into Lower case
		list.stream().map(e->e.toLowerCase()).forEach(e->System.out.println(e));
		list.stream().map(e->e.length()).forEach(e->System.out.println(e));
		
	}

}
