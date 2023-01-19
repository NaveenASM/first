package com.qa.javacodes.ArithmeticPrograms;

public class Patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		leftInc();
		System.out.println("----------------");
		leftDec();
		System.out.println("----------------");
		Full();
		System.out.println("----------------");
		FullABC();
	}
	
	public static void  leftInc() {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	
	public static void leftDec () {
		for (int i=1; i<=5; i++) {
			for (int j=5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Full () {
		for (int i=1; i<=5; i++) {
			for (int j=1; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for (int i=1; i<=5; i++) {
			for (int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void FullABC () {
		                // ASCII of A is 65, a is 97

		for (int i=1; i<=5; i++) {
			int Alpha = 65;             //IMPortant
			for (int j=1; j<=i;j++) {
				System.out.print((char)(Alpha++));
			}
			System.out.println();
		}
		
		for (int i=1; i<=5; i++) {
			int n=65;
			for (int j=4; j>=i; j--) {
				System.out.print((char)(n++));
			}
			System.out.println();
		}
	}
	
	
	
}
