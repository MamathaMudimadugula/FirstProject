package com.June6th.Queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueMethods {

	public static void main(String[] args) {
		Queue<String> queue=new PriorityQueue<>();//Empty Queue
		System.out.println(queue.offer("Apple"));
		System.out.println(queue.offer("Bat"));
		System.out.println(queue.offer("Bowle"));
		System.out.println(queue.offer("Ram"));
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
	queue.addAll(List.of("MAnu","Shivani","Ramya"));
	System.out.println(queue);
	
	}

}
