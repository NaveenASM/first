package com.qa.javacodes.StringManipulations;

import java.util.ArrayList;
import java.util.*;

public class Without_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		len("naveen kumar madhu");
		len2("naveen");
	}

	public static void len(String s) {
		String s2[] = s.split("");
		ArrayList<String> al = new ArrayList<String>();
		for(String s3 : s2) {
			al.add(s3);
		}
		System.out.println(al.size());
	}
	
	public static void len2(String s) {
	
		ArrayList<String> al1 = new ArrayList<String>();
		al1.addAll(Arrays.asList(new String[] {"n","a","v","e","e","n"}));
		System.out.println(al1.size());
	}
}
