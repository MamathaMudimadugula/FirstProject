package com.June7th.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class DifferenceBetweenMaps {

	public static void main(String[] args) {
		Hashmap() ;
		Linkedhashmap() ;
		Treemap();

	}
	public static void Hashmap() {
	
		Map<String,Integer> map=new HashMap<>();
		map.put("Manu", 2);
		map.put("Am", 5);
		map.put("Ramya", 25);
		System.out.println(map);
		
	}
public static void Linkedhashmap() {
	Map<String, Integer> map = Map.of("A", 1, "E", 4, "C", 3, "D", 7, "B", 2);	
	Map<String,Integer> map1=new LinkedHashMap<>(map);
	System.out.println(map1);
	}
	
public static void Treemap() {
	Map<String, Integer> map = Map.of("A", 1, "E", 4, "C", 3, "D", 7, "B", 2);	
	Map<String,Integer> map2=new TreeMap<>(map);
	System.out.println(map2);
	}
}
	

