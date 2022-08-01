package com.June12.FunctionalProgramming;

import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/*class EvenNumberPredicate implements Predicate<Integer> {
	@Override
	public boolean test(Integer numbers) {
		return (numbers%2==0);
	}
	}
class SysOutConsumer implements Consumer<Integer> {
	@Override
	public void accept(Integer numbers) {
		System.out.println(numbers);
	}
}*/
class mapinterface implements Function<Integer,Integer>{
	@Override
	public Integer apply(Integer numbers) {
		// TODO Auto-generated method stub
		return numbers+numbers;
	}
}
public class MapBehindTheScreenrunner {
	
	public static void main(String[] args) {
				List<Integer> numbers = List.of(23, 12, 34, 45, 36, 48);
List<Integer> evensToo = numbers.stream().filter(new EvenNumberPredicate()).collect(Collectors.toList());
numbers.stream().filter(new EvenNumberPredicate()).map(new mapinterface()).forEach(new SysOutConsumer());
			}
		}

	


