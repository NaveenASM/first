package com.qa.codes.strings;

public class ContainsOnlyDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(verify("naveen123mounika"));
//		System.out.println(verify("845945"));
//		System.out.println(verify("naveen"));
//		System.out.println(verify(""));
		
		String s1 ="Hello";
		String s2 ="Hello";
		String s3 = new String("naveen");
		String s4 = new String("naveen");
		System.out.println("------------------------------");
		System.out.println(s1==s2);
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		System.out.println(digit("857493"));
		
	}
	
	
	public static boolean digit(String s) {
		String sa[] = s.split("");
		char ch[] = s.toCharArray();
		
		for(char ci : ch) {
			if(!Character.isDigit(ci)) {
				return false;
			}
		}
		return true;
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static boolean verify(String s) {
		
		int len = s.length();
		
		//for empty or null
		if(s == null || len ==0) {
			return false;
		}
		
		for(int i=0; i<len; i++) {
			 if( ! Character.isDigit(s.charAt(i))) {     //Important
				 return false;
			 }
		}
			return true;		
	}
}
