
package com.java.scanner;

import java.util.Scanner;

public class Calculaterscan {
	public static void main(String[] args) {
		System.err.println("here we go !");
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter ur first input");
		int a = sc.nextInt();
		System.out.println("please enter your second input ");
		int b = sc.nextInt();
		int mul = a*b;
		System.err.println("here is your output >>>>>");
		System.out.println(mul);
		sc.close();
		
	}
}


