package com.June10.FunctionalProgramming;

import java.util.List;

public class IntermediatedSort {

	public static void main(String[] args) {
		List<Integer> list=List.of(14,62,13,4,55,6);//immutable List Creation
list.stream()
           .sorted()                         //Intermediated
                    .forEach(e->System.out.println(e));//for each Terminal
	}

}
