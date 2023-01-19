package com.qa.javacodes.ArithmeticPrograms;

public class Factorial {
	static int fact=1;

	public static void main(String[] args) {
		
      facto(5);
	}
	
	public static void facto(int n) {
		
		for (int i=n ; i>=1 ; i--) {
			fact = fact *i;
		}
		System.out.println("factorial of" + " " + n +" " + "is" + " " + fact);
	}

}
