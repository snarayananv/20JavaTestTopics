package org.java;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MethodOverLoading {

	public static void main(String[] args) {

	
		Map<Integer , String> m = new LinkedHashMap<>();
		m.put(10, "Phython");
		m.put(20, "java");
		m.put(30, "sql");
		m.put(40, "API");
		
	
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		System.out.println(entrySet);
		
		for (Entry<Integer, String> entry : entrySet) {
			
			// System.out.println(entry);
			System.out.println(entry.getKey());
			//System.out.println(entry.getValue());
		}
		
		
		
		
	}
}
