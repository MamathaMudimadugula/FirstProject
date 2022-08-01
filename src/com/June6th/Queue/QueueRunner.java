package com.June6th.Queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;


class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String value1,String value2) {
	
		return Integer.compare(value1.length(),value2.length());
	}

	
	

	
}
public class QueueRunner {

	

	public static void main(String[] args) {
	
		Queue<String> queue=new PriorityQueue<>(new StringLengthComparator());//Empty Queue	
		queue.addAll(List.of("MAnu","Shivani","Ramya"));
		System.out.println(queue);
	}

}
