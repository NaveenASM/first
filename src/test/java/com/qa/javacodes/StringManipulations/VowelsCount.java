package com.qa.javacodes.StringManipulations;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class VowelsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		count("naveen mounika adhya shanyuth");
		usingArray("naveen mounika adhya shanyuth");
	}
	
	public static void count(String s) {
		
		char[] ch = s.toCharArray();
		
		List<Character> ll = new LinkedList<Character>();
		
		for(char c: ch) {
			ll.add(c);
		}
		System.out.println(ll);	
		 
		Iterator<Character> it = ll.iterator();
		int count =0;
		while(it.hasNext()) {
			 char c1 = it.next();
			if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ) {
				count ++;
				System.out.print(c1 + " ");
			}
		}
		System.out.println(count);
	}
	
	public static void usingArray(String s1 ) {
		char[] ch1 = s1.toCharArray();
		int count =0;
		for(char c1 : ch1) {
			if(c1 == 'a' || c1 == 'e' || c1 == 'i' || c1 == 'o' || c1 == 'u' ) {
				count ++;
				System.out.print(c1 + " ");
			}
		}
		System.out.println(count);
	}
}
