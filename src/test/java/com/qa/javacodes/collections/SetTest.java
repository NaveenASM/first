package com.qa.javacodes.collections;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<String> hs = new HashSet<String>();
		hs.addAll(Arrays.asList(new String[] {"Naveen", "Madhu","kumar","Mounika"}));
		
		System.out.println(hs);
		System.out.println("using advance for loop");
		for(String e : hs)
		{
			System.out.println(e);
		}
		
		System.out.println("using iterator");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set<String> hs2 = new HashSet<String>();
		hs2.addAll(Arrays.asList(new String[] {"Adhya","Naveen","Mounika","Shanyuth"}));
		System.out.println(hs2);
		
		
		// for Integer
		System.out.println("for integer");
		Set<Integer> hs3 = new HashSet<Integer>();
		hs3.addAll(Arrays.asList(new Integer[] {10,20,30,40}));
		for(Integer i : hs3)
		{
			System.out.print(i + " ");
		}
		//Union
		System.out.println("Union");
		hs.addAll(hs2);
		System.out.println(hs);
		
		//Intersection
		System.out.println("Intersection");
		hs.retainAll(hs2);
		System.out.println(hs);
		
		//differences
				System.out.println("diff");
				hs.removeAll(hs2);
				System.out.println(hs);
		
	}

}
