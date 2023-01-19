package com.qa.javacodes.StringManipulations;

public class ReverseWordInString {
	static String st="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // naveen madhu
		// madhu naveen
		
		reverseword("Naveen Madhu");
	}
	
	public static void reverseword(String input) {
		String s[] = input.split(" ");
		
		//revrsing each string
		for(String str: s) {
			StringBuffer sf = new StringBuffer(str);
			StringBuffer s1 = sf.reverse();
			st= st+s1+" ";
		}
		System.out.println(st);	
	}
	
	public static void occurence(String s) {
		
	}

}
