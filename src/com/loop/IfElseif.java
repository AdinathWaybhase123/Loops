package com.loop;

import java.util.Scanner;

public class IfElseif {
	public static void main(String[] args) {
		// int num=100;

		while (true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("enter value you want ");
			int num1 = sc.nextInt();
			if (num1 < 12) {
				System.out.println("if loop printt");
			} else if (num1 > 11) {
				System.out.println("else if loop");

			} else {
				System.out.println("else loop executed");
			}
		}

	}
}