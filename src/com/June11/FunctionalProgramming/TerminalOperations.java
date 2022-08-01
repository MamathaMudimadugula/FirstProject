package com.June11.FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class TerminalOperations {

	public static void main(String[] args) {
		System.out.println(List.of(1,2,3,4,5,6,8,9).stream().filter(e->e%2==1).collect(Collectors.toList()));
		
		System.out.println(List.of(1,2,3,4,5,6,8,9).stream().filter(e->e%2==0).collect(Collectors.toList()));
		//IntStream boxed() returns a Stream consisting of the elements of this stream, each boxed to an Integer.
		System.out.println(IntStream.range(1, 11).map(e->e*e).boxed().collect(Collectors.toList()));//squre
		System.out.println(IntStream.range(1, 11).map(e->e*e*e).boxed().collect(Collectors.toList()));//cube
	}

}
