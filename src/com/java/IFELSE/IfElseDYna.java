package com.java.IFELSE;

import java.util.Scanner;

public class IfElseDYna {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter input");
		int a= sc.nextInt();
		if (a%2==0) {
			System.out.println("input is even number");
		}
		else {
			System.out.println("input is odd number ");
		}
	}

}
