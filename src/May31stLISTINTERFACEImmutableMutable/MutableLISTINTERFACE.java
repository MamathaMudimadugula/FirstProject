package May31stLISTINTERFACEImmutableMutable;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class MutableLISTINTERFACE {
	public static void main(String[] args) {
		mutableArrayList();
		mutableLinkedList();
		mutableVector();
	}

//Below are Mutable List [Array,Linked,Vector]
	public static void mutableArrayList() {
		List<String> words = List.of("Manju", "Ramya", "Manu", "Laasya");// Immutable we can't add any value
		List<String> ArrayList = new ArrayList<String>(words);// Here i am using above words List and Priinting below
		System.out.println(ArrayList);
		ArrayList.add("Laddu");
		System.out.println(ArrayList);

	}

	public static void mutableLinkedList() {
		List<String> words = List.of("a", "b", "c", "d");// Immutable we can't add any value
		List<String> LinkedList = new LinkedList<String>(words);// Here i am using above words List and Priinting below
		System.out.println(LinkedList);
		LinkedList.add("e");
		LinkedList.remove("a");
		System.out.println(LinkedList);

	}

	public static void mutableVector() {
		List<String> words = List.of("a", "b", "c", "d");// Immutable we can't add any value
		List<String> Vector = new Vector<String>(words);// Here i am using above words List and Priinting below
		System.out.println(Vector);
		Vector.add("e");
		Vector.remove("a");
		System.out.println(Vector.size());
		System.out.println(Vector.isEmpty());
		System.out.println(Vector);
	}
}