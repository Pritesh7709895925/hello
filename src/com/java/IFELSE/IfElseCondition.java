package com.java.IFELSE;

import java.util.Scanner;

public class IfElseCondition {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age ");
		int age = sc.nextInt();
		if (age<=15) {
			System.out.println("its child age");
		}
		else {
			System.out.println("its adult age");
		}
		

	}

}
