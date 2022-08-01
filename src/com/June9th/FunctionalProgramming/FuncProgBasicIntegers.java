package com.June9th.FunctionalProgramming;

import java.util.List;

public class FuncProgBasicIntegers {

	public static void main(String[] args) {
		List<Integer> list=List.of(17,12,1,7,2);
		PrintwithFPNum(list);
	}

	public static void PrintwithFPNum(List<Integer> list) {
		
		list.stream().forEach(
				element->System.out.println(element)
				);
	
	}
}
//we can Define LIst iN main  and in the method if we pass Like above no need of writing the 1st line list in method
//we can use it by over there only