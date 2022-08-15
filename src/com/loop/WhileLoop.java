package com.loop;

public class WhileLoop {
	public int  sum( int a, int b) {
	int sum=a+b;
	return sum;
	}
public static void main(String[] args) {
	WhileLoop wl=new WhileLoop();
	int i=10;
	while(i<7) {
		System.out.println("value of i"+"  "+i);
	}
	System.out.println("not in while loop");
}
}
