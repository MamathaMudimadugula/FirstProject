package com.June7th.Map;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		Char();
		str();
	}

	public static void Char() {
		String str = "This is Awesome occasion\" + \"This has never happend before";
		Map<Character, Integer> occrances = new HashMap<>();
		char[] characters = str.toCharArray();// convert string into sequence of charcters
		for (char character : characters) {
			// Get the character
			Integer integer = occrances.get(character);// get the character
			if (integer == null) {
				occrances.put(character, 1);
			} else {
				occrances.put(character, integer + 1);
			}
			// If it is there,increase the count
			// If it is not there,initialize to 1

		}
		System.out.println(occrances);
	}

	public static void str() {
		String str = "This is Awesome occasion\" + \"This has never happend before";
		Map<String, Integer> Stringoccrances = new HashMap<>();
		String[] words = str.split("");// convert string into sequence of
		for (String word : words) {
			// Get the character
			Integer integer = Stringoccrances.get(word);// get the character
			if (integer == null) {
				Stringoccrances.put(word, 1);
			} else {
				Stringoccrances.put(word, integer + 1);
			}
			// If it is there,increase the count
			// If it is not there,initialize to 1

		}
		System.out.println(Stringoccrances);
	}

}
