package com.qa.javacodes.ArithmeticPrograms;

public class Primenumber {
	public static void main(String[] args) {
		
		printPrime(100);

	}
	
	public static boolean prime(int n) {
		
		if(n<=1){
		 return false;
		}
		
		for(int i=2; i<n;i++) {
			if(n % i ==0) {
				return false;
		     }
	    }
		return true;
	}
	
	public static void printPrime(int num) {
		int count = 0;
		for(int j=1; j<=num;j++) {
			if(prime(j) == true) {
				System.out.print(j + ", ");
				count = count+1;
			}		
		}
		System.out.println();
		System.out.println("available prime numbers are" + " " + count);
	}
		
}
