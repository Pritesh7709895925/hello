package com.twoclass;

import java.util.Scanner;

public class Testdynamic {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your Fname");
		String Fname = sc.next();
		System.out.println("enter your Lname");
		String Lname = sc.next();
		System.out.println("enter your year of birth");
		int year = sc.nextInt();
		usernamedyna ud = new usernamedyna();
		String Username = ud.getUname(Fname,Lname,year);
		System.out.println("Username is   "+Username);
		
	}

}
