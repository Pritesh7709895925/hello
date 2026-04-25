package com.twoclass;

import java.util.Scanner;

public class test001 {
	public static void main(String[] args) {
		student s = new student();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ur input");
		s.city= sc.nextLine();
		System.out.println("ur city is"+s.city);
		
		//s.city= "pune";
		//s.id = 1005;
		//s.name = "rahul";
		//s.payment = 35000;
		//System.out.println(s.city);
		//System.out.println(s.id);
		//System.out.println(s.name);
		//System.out.println(s.payment);
		
		//student s1 = new student();
		//s1.city= "mumbai";
		//s1.id= 1004;
		//s1.name	= "harsh";
		//s1.payment=50000;
		//System.out.println(s1.city);
		//System.out.println(s1.id);
		//System.out.println(s1.name);
		//System.out.println(s1.payment);
		
	}

}
