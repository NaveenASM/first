package com.qa.javacodes.Arrays;

public class Leadernumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		int a[] = {7,51,32,13,2,25,4};
		leader(a);
	}
	
	public static void leader(int a[]) {
		
		int len = a.length;
		int max = a[len-1];
		System.out.println(max);
		for(int i=len-2; i>=0; i--) {
			if(a[i]>max) {
				System.out.println(a[i]);
				max = a[i];
			}
		}
	}

}
