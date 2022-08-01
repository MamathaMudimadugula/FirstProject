package com.June10.FunctionalProgramming;

import java.util.stream.IntStream;

public class Print1to10RangeIntegrs {

	public static void main(String[] args) {
		//IntStream.range(200, 222).forEach(e->System.out.println(e));//print 200 t0 222 range in o/p
	 IntStream.range(1, 10).forEach(e->System.out.println(e));//print 1 t0 10 range in o/p
		 
	 IntStream.range(1, 10)
	                    .map(e->e*e)
	                       .forEach(e->System.out.println(e));//Print Squres of 1 to 10
	}

}
