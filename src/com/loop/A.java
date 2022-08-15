package com.loop;
public class A {
	public static void main(String[] args) throws NullPointerException {
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
			
		}
	}
}
