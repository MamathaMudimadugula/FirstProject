package com.June12.FunctionalProgramming;

import java.util.List;
import java.util.function.Predicate;

class EvenNumberPredicate implements Predicate<Integer> {
//EvenNumberPredicate implements the Predicate<Integer> interface, and overrides the test() method.
	//Something similar to EvenNumberPredicate is created when we use lambda expressions num -> num%2 == 0 .

@Override
public boolean test(Integer number) {
	return (number%2==0);
}
}
public class LambdaBehindTheScenesRunner {
	public static void main(String[] args) {
		List.of(23, 43, 34, 45, 36, 48)
		.stream()
		.filter(new EvenNumberPredicate())
		.forEach(e -> System.out.println(e));
	}
}
