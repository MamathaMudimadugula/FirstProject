package com.June8th.Generics;

import java.util.ArrayList;

public class MyCustomList<T> {//<T> Means type data type or//<TYPE>
 ArrayList<T> list=new ArrayList<T>();// ArrayList<TYPE> list=new ArrayList<TYPE>();
	public void addElement(T element){
		list.add(element);
	}
	public void removeElement(T element){
		list.remove(element);
	}
	public String toString() {
		return list.toString();
		
	}
	public T get(int index) {//to get the index 
		// TODO Auto-generated method stub
		return list.get(index);
	}
}
