package com.qa.javacodes.Arrays;

public class Missednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,4,5,7,9};
		String s1 ="naveen";
		String s2 = "madhu";
		String s[] = {s1,s2};
		
		for(int i=0; i<s.length;i++) {
			System.out.println(s[i]);
		}
		
		
//		for(int i=1; i<a.length;i++) {
//			 for(int j=i+1; j<a.length-1; j++) {
//			     if(a[i]==a[j]-1) {
//			    	 System.out.println("there are no missing numbers in array");
//			     }else {
//			    	 System.out.println("missing number is :"+ a[j]);
//			     }
//			 }
//			 }
	}

}
