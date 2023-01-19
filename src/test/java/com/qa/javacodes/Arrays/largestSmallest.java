package com.qa.javacodes.Arrays;

import java.util.Arrays;

public class largestSmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {4,3,7,98,65,34,8,56,1,101};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[0] + " " + a[a.length-1]);
		
	}

}
