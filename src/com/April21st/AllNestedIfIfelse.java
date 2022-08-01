package com.April21st;

public class AllNestedIfIfelse {

	public static void main(String[] args) {
		//puzzle1();
		 puzzle2();
	}

private static void puzzle1() {
	int k=15;
		if(k>15) {
			System.out.println("1");
		}
		else if(k>10){
			System.out.println("2");
		}
		else if(k<20){
			System.out.println("3");
		}
		else {
			System.out.println("4");
		}
}
	
private static void puzzle2() {
			int l=15;
				if(l<20) {
					System.out.println("1");
				}
				if(l>20) {
					System.out.println("2");
				}
				else {
					System.out.println("Who I am I");
				}
		}
}
