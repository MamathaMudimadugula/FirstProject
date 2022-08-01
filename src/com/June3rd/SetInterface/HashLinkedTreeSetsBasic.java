package com.June3rd.SetInterface;


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashLinkedTreeSetsBasic {

	public static void main(String[] args) {
		Hashset();//Prints O/p with no-order
		LinkedSet();//Prints O/p ORDER
		treeSet();//Sorted Order
	}
	//Prints O/p with no-order
public static void Hashset() {
Set<Integer> num=new HashSet<Integer>();//Create Empty Set[]
num.add(1234);
num.add(123);
num.add(12);
num.add(1);
System.out.println("set"+num);
}
	
//Prints O/p ORDER
public static void LinkedSet() {
Set<Integer> num=new LinkedHashSet<Integer>();//Create Empty Set[]
num.add(1234);
num.add(123);
num.add(12);
num.add(1);
System.out.println("LinkedHashSet"+num);
}

//Sorted Order
public static void treeSet() {
Set<Integer> num=new TreeSet<Integer>();//Create Empty Set[]
num.add(1234);
num.add(123);
num.add(12);
num.add(1);
System.out.println("treeSet"+num);
}

}
