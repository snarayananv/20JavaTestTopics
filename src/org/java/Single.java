package org.java;
public class Single {
	static Single e; 
	private Single() {		
	}
	public static Single getObject() {
		System.out.println(System.identityHashCode(e));
			if (e == null) {	
			e = new Single();
		}
		return e;
	}
	 
	public static void main(String[] args) {
		
		Single object4 = getObject();
		System.out.println(System.identityHashCode(object4));
		Single object5 = getObject();
		System.out.println(object5);
		
		
	}

}
