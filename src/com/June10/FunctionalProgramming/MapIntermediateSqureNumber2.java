package com.June10.FunctionalProgramming;

import java.util.List;

public class MapIntermediateSqureNumber2 {

	public static void main(String[] args) {
		List<Integer> list=List.of(14,62,13,4,55,6);//immutable List Creation
list.stream()
      .distinct()
           .sorted()//Intermediated
                   .map(e->e*e)//the map() is used to transform one object into other by applying a function.
                        .forEach(e->System.out.println(e));//for each Terminal
	}

	}



