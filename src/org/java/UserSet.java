package org.java;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserSet {

	public static void main(String[] args) {

		Map<String, Over> m = new LinkedHashMap<>();
	
    
		Over o = new Over();
		o.setId(12);
		o.setName("Suriya");
		o.setL(9790383744l);

		Over o1 = new Over();
		o1.setId(13);
		o1.setName("narayanan");
		o1.setL(9999999999l);

		m.put("1st Emm", o);
		m.put("2nd", o1);

		Set<Entry<String, Over>> y = m.entrySet();
		for (Entry<String, Over> x : y) {
		
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getL());
		
		}
	
		
		

	}
}
