package com.qa.javacodes.ArithmeticPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;

public class ArraySorting {
   static int count =9;
	public static void main(String[] args) {
		
		int a[] = {6,8,4,3,5,2,1,9,7};
		
		System.out.println("using Arrays.sort");
		Arrays.sort(a);
		
		for(int i=0; i<a.length; i++) {
			
			System.out.println(a[i] + " " + count);
			count = count -1;
		}
		
		
		
//		System.out.println("using Collections");
//		ArrayList<Integer> a1 = new ArrayList<Integer>();
//		
//		for (int i=0; i<a.length;i++) {
//			a1.add(a[i]);
//		}
//		
//		Collections.sort(a1);
//		
//		Iterator<Integer> it = a1.iterator();
//		while(it.hasNext())
//		{
//			System.out.println(it.next() + " --> " + count);
//			count --;
//		}
//		
	}

}
