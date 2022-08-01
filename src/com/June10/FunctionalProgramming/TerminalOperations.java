package com.June10.FunctionalProgramming;

import java.util.List;

public class TerminalOperations {

	public static void main(String[] args) {
	System.out.println(
				 List.of(1,3,15,672,12)
				.stream()
				.max(
						(n1,n2)->Integer.compare(n1, n2))
				.get()
				);

	}

}
