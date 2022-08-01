package com.June11.FunctionalProgramming;

import java.util.List;

public class Optional {

	public static void main(String[] args) {
		System.out.println(List.of(12,1,14,16)
				.stream()
				.filter(n->n%2==0)
				.max((n1,n2)->Integer.compare(n1,n2))
				.get());

	

	System.out.println(List.of(13,1,15)
			.stream()
			.filter(n->n%2==0).
			max((n1,n2)->Integer.compare(n1,n2))
			.orElse(0));

}
}
