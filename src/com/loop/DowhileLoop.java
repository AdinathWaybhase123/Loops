package com.loop;

import java.util.Scanner;

public class DowhileLoop {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int ch=sc.nextInt();
//	int i=10;
	do {
		System.out.println("do loop");
	} while (ch<10);
}
}
