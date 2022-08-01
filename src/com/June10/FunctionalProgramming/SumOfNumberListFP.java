package com.June10.FunctionalProgramming;

import java.util.List;

public class SumOfNumberListFP {

	public static void main(String[] args) {
	List<Integer> list=List.of(1,2,3,4,5,6);
	FPSum(list);
	FPSub(list);
	normalLoopSum(list);

	}






	private static void FPSum(List<Integer> list) {
		int sum=list.stream().reduce(0,(number1,number2)->number1+number2);
		System.out.println(sum);
	}

	
	
	private static void FPSub(List<Integer> list) {
		int sum=list.stream().reduce(0,(number1,number2)->number1-number2);
		System.out.println(sum);
	}

	
	
	
	private static void normalLoopSum(List<Integer> list) {
		int sum=0;
		for(int numbers:list)	{
			sum=sum+numbers;		
		}
		System.out.println(sum);
	}	
	
}
