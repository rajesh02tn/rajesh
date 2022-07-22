package org.datatypes;

import java.util.ArrayList;
import java.util.Iterator;

public class List {

	public static void main(String[] args) {
		//Arraylist
		
		ArrayList<Integer> alist = new ArrayList<>();
		alist.add(50);
		alist.add(85);
		alist.add(45);
		
		System.out.println(alist);
		for (int num : alist) {
			System.out.println(num);
			}
		Integer num1 = alist.get(1);
		System.out.println(num1);
		Integer remove = alist.remove(0);
		System.out.println(remove);
		System.out.println(alist);
		 alist.set(0, 55);
		System.out.println(alist);
		
		
		
		//iterator
		Iterator<Integer> iterator = alist.iterator();
		Integer next1 = iterator.next();
		Integer next2 = iterator.next();
		System.out.println(next1);
		System.out.println(next2);
		

	}

}
