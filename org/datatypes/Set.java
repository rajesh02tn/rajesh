package org.datatypes;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {

	public static void main(String[] args) {
		// set
		
		HashSet<String> li = new HashSet<String>();
		li.add("rajesh");
		li.add("umar");
		li.add("siva");
		li.add("rajesh");
		
		System.out.println(li);
		
		LinkedHashSet<String> le = new LinkedHashSet<>();
		le.add("rajesh");
		le.add("umar");
		le.add("siva");
		le.add("rajesh");
		
		System.out.println(le);
		

	}

}
