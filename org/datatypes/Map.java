package org.datatypes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {

	public static void main(String[] args) {
		// map
		
		HashMap<String, String> map = new HashMap<>();
		
		
		map.put("Name", "Rajesh");
		map.put("actor", "siva");
		map.put("doctor", "hari");
		map.put("actor", "raj");
		map.put("sudent", "raj");
		
		System.out.println(map.get("actor"));
		System.out.println(map);
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		String next = iterator.next();
		System.out.println(next);
		Collection<String> values = map.values();
		values.iterator();
		
		

	}

}
