package com.twoclass;

public class usernamedyna {
	public String getUname(String Fname, String Lname, int yob) {
		int year = yob%100;
		String user = Fname+Lname+year;
		return user;
		
	}
	
}
