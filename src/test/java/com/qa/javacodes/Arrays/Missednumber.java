package com.qa.javacodes.Arrays;

public class Missednumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,5,6,7};
		int n = a.length;
		
		int actsum = n*(n+1)/2;
		int sum=0;

		
		for(int i : a) {
			sum =sum+i;
		}
		int miss = sum-actsum;
		System.out.println(miss);
		
	}
}

			 
	


