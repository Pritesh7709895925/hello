package com.java.scanner;

import java.util.Scanner;

public class Calculaterscan {
	public static void main(String[] args) {
		System.out.println("Lets go");
		Scanner mb = new Scanner(System.in);
		System.out.println("enter value a");
		int a = mb.nextInt();
		System.out.println("enter value b");
		int b =mb.nextInt() ;
		int sum = a+b;
		System.out.println("sum is  "+sum);
				
	}

}
