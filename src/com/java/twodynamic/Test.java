package com.java.twodynamic;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner mg = new Scanner(System.in);
		System.out.println("enter your first name");
		String fname = mg.next();
		System.out.println("enter your last name");
		String lname = mg.next();
		System.out.println("enter your age");
		int age = mg.nextInt();
		DetailDyna BB = new DetailDyna();
		String username = BB.Detail(fname, lname, age);
		System.out.println(username);
		
	}
	
}
