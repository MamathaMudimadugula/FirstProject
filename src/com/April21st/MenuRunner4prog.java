package com.April21st;

import java.util.Scanner;

public class MenuRunner4prog {

	public static void main(String[] args) {
		//class1();
		//class2();
		class3();
	}
	private static void class1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter 1st Number : ");
		int Number = sc.nextInt();
		
	    System.out.println("The Number you have enterd is:"+Number);
	}

private static void class2() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number : ");
	int Number1 = sc.nextInt();
	
	System.out.println("Enter 2nd Number : ");
	int Number2=sc.nextInt();
	
   // System.out.println("The Number you have enterd is:"+Number1+"\n"+Number2);
	System.out.println("The Number you have enterd is:"+Number1+","+Number2);
}

private static void class3() {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 1st Number : ");
	int Number1 = sc.nextInt();
	
	System.out.println("Enter 2nd Number : ");
	int Number2=sc.nextInt();
	
   System.out.println("Choices Available are:");
   System.out.println("1-Add");
   System.out.println("2-Sub");
   System.out.println("3-Division");
   System.out.println("4-Multiplication");
   
   System.out.print("Enter Your choice:");
   int choice = sc.nextInt();
   
   System.out.println("Your choices are:");
   System.out.println("Number1 :" +Number1);
   System.out.println("Number2 :" +Number2);
   System.out.println("Choice :" +choice);
   
   if(choice == 1) {
	   System.out.println("Result" +(Number1+Number2));
   }
   else if(choice == 2) {
	   System.out.println("Result" +(Number1-Number2));
   }
   else if(choice == 3) {
	   System.out.println("Result" +(Number1/Number2));
   }
   else if(choice == 4) {
	   System.out.println("Result" +(Number1*Number2));
   }}
}