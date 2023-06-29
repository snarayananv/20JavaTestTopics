package org.java;
public class SingleTon {
	static SingleTon e;
	 private SingleTon() {
	}
	public static SingleTon getObject() {
		System.out.println(System.identityHashCode(e));
		if (e == null) {
			e = new SingleTon();
		}
		return e;
	}
	public static void main(String[] args) {

		SingleTon e = getObject();
		System.out.println(System.identityHashCode(e));
		SingleTon e1 = getObject();
		System.out.println(System.identityHashCode(e1));
		
		
		
}}
