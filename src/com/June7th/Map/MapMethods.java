package com.June7th.Map;

import java.util.HashMap;
import java.util.Map;

public class MapMethods {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 1, "E", 4, "C", 3, "D", 7, "B", 2);// Map doesn't implement any
																					// collection(List,Set,Queue)
		System.out.println(map);

		System.out.println(map.get("F"));// Getting
		System.out.println(map.containsKey("E"));// Whether Key is Present or not
		System.out.println(map.containsValue(3));// Check the value is present or not
		System.out.println(map.isEmpty());// Check map is empty
		System.out.println(map.size());// check the size
        System.out.println(map.values());
        System.out.println(map.keySet());
		// To put the values need Convert Immutable Map to Mutable Map
		Map<String, Integer> hashmap = new HashMap<>(map);
		hashmap.put("F", 0);// adding the values
		System.out.println(hashmap);
		System.out.println(hashmap.keySet());// prints only Keys
		System.out.println(hashmap.values());// prints only values

	}

}
