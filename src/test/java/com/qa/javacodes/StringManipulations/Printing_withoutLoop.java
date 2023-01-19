package com.qa.javacodes.StringManipulations;

public class Printing_withoutLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		check(5,10);
		String s = "nabeen908$%";
		
	}
	
	public static void check(int startnum, int endnum) {
		
		if(startnum<=endnum) {
		System.out.println("Naveen" + " " + startnum);
		startnum++;
		check(startnum,endnum);
		}
		
	}

}
