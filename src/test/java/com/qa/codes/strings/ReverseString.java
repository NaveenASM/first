package com.qa.codes.strings;

public class ReverseString {

	public static void reverse(String s) {
		
		String sa[] = s.split(" ");
		String rev = "";
		
		for(String s1 : sa) {
			StringBuffer sf = new StringBuffer(s1);
			rev = rev + " " + sf.reverse();
		}	
		System.out.println(rev);
	}
	
	public static void polindrome(String s) {
		String rev = "";
		StringBuffer sf = new StringBuffer(s);
		rev = rev + sf.reverse();
		
		if(s.equals(rev)) {
			System.out.println(s + " " + "is polindrome");
		}
		
	}
	
	public static void main(String[] args) {
		reverse("madhu naveen kumar madam");
		polindrome("madam");
	}

}
