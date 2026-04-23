package com.twoclass;

public class Username {
	public String Getusername(String Fname, String Lname, int yob) {
		int year=yob%100;
	
		
		String user = Fname+Lname+year;
		return user;
		
		
	}
	
	

}
