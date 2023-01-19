package com.qa.javacodes.Arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class Joinig2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s1 [] = {"naveen", "Mounika", "Adhya"};
		String s2 [] = {"naveen11", "Mounika22", "Adhya1122"};
		
		Stream<String> st1 =  Arrays.stream(s1);
		Stream<String> st2 =  Arrays.stream(s2);
		
	//	String s3[] = Stream.concat(st1,st2).toArray(size -> new String[size]);
	//	for(String st : s3) {
	//		System.out.print(st + " ");
//		}
	}

}
