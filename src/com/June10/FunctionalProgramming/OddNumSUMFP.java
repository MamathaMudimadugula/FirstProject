package com.June10.FunctionalProgramming;

import java.util.List;

public class OddNumSUMFP {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6);//immutable List Creation
		int sum=list.stream().
				filter(number->number%2==1).
				reduce(0,(number1,number2)->number1+number2);//Fp Loop

	System.out.println(sum);

}
}