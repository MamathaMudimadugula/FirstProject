package April30th.Arrays;

import java.util.ArrayList;

public class ArrayListAddRemove {

	public static void main(String[] args) {
		Int();
		string();
	}

	static void Int() {
		ArrayList arraylist = new ArrayList();
		arraylist.add(1);
		arraylist.add(2);
		arraylist.add("sdhfv");
		System.out.println(arraylist);
		/*
		 * arraylist.remove(1); System.out.println(arraylist);
		 */	}

	static void string() {
		ArrayList<String> arraylist = new ArrayList<String>();
		arraylist.add("Mom");
	    arraylist.add("Dad");
		System.out.println(arraylist);
		  arraylist.remove("Dad");
		  System.out.println(arraylist);
		 
	}
}
