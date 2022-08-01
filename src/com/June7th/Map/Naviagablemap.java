package com.June7th.Map;

import java.util.Map;
import java.util.TreeMap;

public class Naviagablemap  {

	public static void main(String[] args) {
		Map<String, Integer> map = Map.of("A", 1, "E", 4, "C", 3, "D", 7, "B", 2);
		Map<String, Integer> treemap = new TreeMap<String, Integer>(map);
		System.out.println(((TreeMap<String, Integer>) treemap).higherKey("A"));//Higher Key USed to Print After the Value of "A"

	System.out.println(((TreeMap<String, Integer>) treemap).ceilingKey("E"));

	System.out.println(((TreeMap<String, Integer>) treemap).lowerKey("C"));

	System.out.println(((TreeMap<String, Integer>) treemap).floorKey("B"));

	System.out.println(((TreeMap<String, Integer>) treemap).firstEntry());
	
	System.out.println(((TreeMap<String, Integer>) treemap).lastEntry());
	System.out.println(((TreeMap<String, Integer>) treemap).subMap("A", "E"));//returns evrything between A and E
	System.out.println(((TreeMap<String, Integer>) treemap).subMap("A",true, "E",true));//If we want to include E also in the output
			}

}
