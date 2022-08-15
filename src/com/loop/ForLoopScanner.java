package com.loop;

import java.util.Scanner;

public class ForLoopScanner {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value");
	int ch=sc.nextInt();
	for(int i=0;i<ch;i++) {
		System.out.println(ch);
	}
}
}
