package com.qa.javacodes.ArithmeticPrograms;

public class PatternsRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("in");
		
		PatternsRight p = new PatternsRight();
		p.rghtinc();
		System.out.println("-------------");
		p.leftinc();
		System.out.println("-------------");
		fullRight();
	}
	
	public void rghtinc() {
		for(int i =1; i<=4;i++) {
			for (int j=4; j>=i; j--) {
				System.out.print(" ");  //print spaces
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");  //print *s after space
			}
			System.out.println();//do to next line
		}
	}
	
	public void leftinc() {
		for(int i =1; i<=4;i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(" ");  //print spaces
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");  //print *s after space
			}
			System.out.println();//do to next line
		}
	}
	
	public static void fullRight() {
		for(int i=1; i<=5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=4; k>=i; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}




