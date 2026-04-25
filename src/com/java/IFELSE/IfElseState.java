package com.java.IFELSE;

public class IfElseState {
	public static void main(String[] args) {
		int a = 21;
		if (a%2==0) {
			System.out.println("given number is even");
			if (a%3==0) {
				System.out.println("given no.is good and double if is nested condition");
				
			}
			
		}
		else {
			System.out.println("given number is odd");
		}
	}

}
