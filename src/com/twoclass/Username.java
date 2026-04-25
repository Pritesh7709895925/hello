package com.twoclass;

public class Username {
	public String getUname(String Fname,String Lname,int yob) {
		int year = yob%100;
		String Uname = Fname+Lname+year;
		return Uname;
	
	
	}
}
