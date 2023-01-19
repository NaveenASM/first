package com.qa.javacodes.Arrays;

import java.util.Arrays;

public class ShiftToRight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {3,0,8,5,0,0,6,0};
		shiftToright(a);
		
	}
	
	public static void shiftToright(int b[]) {
		
		int c[] = new int[b.length];
		
		int count =0;
		
		for(int num : b) {
			if(num != 0) {
				c[count] = num;
				count++;
			}
		}
		System.out.println(Arrays.toString(c));	
	}

}
