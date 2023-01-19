package com.qa.javacodes.Arrays;

public class Lowest_nodigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printnumbers(50,1);
	}
	
	public static boolean finding_digit(int x, int d) {
		
		for(int i=0; i<=x; i++) {
			if(i!=d) {
				return true;
			}
		}
		return false;
		
	}
	
	public static void printnumbers(int a, int b) {
		for(int j=0;j<a;j++) {
			if(finding_digit(j,b)) {
				System.out.println(j);
			}
		}
	}

}
