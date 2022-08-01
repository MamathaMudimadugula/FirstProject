package com.June12.FunctionalProgramming;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class SysOutConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer num) {
		System.out.println(num);
	}
}

public class ForeEachBehindTheScenesRunner {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(23, 12, 34, 45, 36, 48);
		List<Integer> evens = numbers.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		List<Integer> evensToo = numbers.stream().filter(new EvenNumberPredicate()).collect(Collectors.toList());
		numbers.stream().filter(new EvenNumberPredicate()).forEach(new SysOutConsumer());
	}
}