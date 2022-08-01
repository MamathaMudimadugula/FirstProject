package com.June8th.Generics;

public class GenericRunner {

	public static void main(String[] args) {
		MyCustomList<String> list=new MyCustomList<>();
		list.addElement("manu");
		list.addElement("ramya");
		list.removeElement("manu");
		
		String value=list.get(0);//to get the index values
		System.out.println(value);
		System.out.println(list);
		 
		MyCustomList<Integer> list1=new MyCustomList<>();
		list1.addElement(1);
		list1.addElement(2);
		list1.removeElement(3);
	Integer value1=list1.get(1);//to get the index values
		System.out.println(value1);
		System.out.println(list1);
		
	}

}
