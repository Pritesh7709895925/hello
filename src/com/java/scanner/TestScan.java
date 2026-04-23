package com.java.scanner;

import java.util.Scanner;

public class TestScan {
	public static void main(String[] args) {
		System.out.println("enter your height");
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		System.out.println("my heaight is "+input);
		
		System.out.println("enter your current location");
		String result = sc.next();
		System.out.println("currently i am in"+result);
	}
	
}
