package com.June10.FunctionalProgramming;

import java.util.List;

public class OddNumFP {

	public static void main(String[] args) {
		List<Integer> list=List.of(1,2,3,4,5,6);
		normalLoopOdd(list);
		
		
	}
	
	//below Prog Using Loop We prinited the odd numbers in the given list
private static void normalLoopOdd(List<Integer> list) {
		
		
		for(int numbers:list)	{
			if(numbers%2!=0)
			{
		System.out.println(numbers);
		}
		}
	}	
}
