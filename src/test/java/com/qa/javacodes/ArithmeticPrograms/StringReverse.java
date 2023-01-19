package com.qa.javacodes.ArithmeticPrograms;

public class StringReverse {
	
    static String s;
    static String rev = "";
    
	public static void main(String[] args) {
		StringReverse sr = new StringReverse();
//		sr.reverse("Naveen");
//		sr.reverse2("Mounika");
		sr.Polindrome("madam");
	}
	
	//using Arithmetic
	public void reverse(String s) {
		 for(int i=s.length()-1; i>=0; i--) {
			 rev = rev + s.charAt(i);
		 }
		 System.out.println("rverse string is" + " " + rev);
	}
	
	//using String Buffer class
	public void reverse2(String s1) {
		StringBuffer sf = new StringBuffer(s1);
		System.out.println("rverse string is" + " " + sf.reverse());
	}
	
	public void Polindrome(String s2) {
		reverse(s2);
		if(s2.equals(rev)) {
			System.out.println("Polindrome string is" + " " + s2);
		}else {
			System.out.println("not a Polindrome string is" + " " + s2);
		}
	}
	

}
