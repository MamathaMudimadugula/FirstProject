package com.June2.Iterator;

public class student  implements Comparable<student>{

	private int id;
	private String name;
	public student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return id+""+name;
	}
	public int compareTo(student that) {
	
		//return String.compare(this.name,that.name);
		return Integer.compare(this.id,that.id);//this to that means Ascending order//that to this means decending order
	
	}
	
}