package com.qa.javacodes.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Arrays;



public class LinkedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//LinkedList <String> ll = new LinkedList<String>();
		List <String> ll = new ArrayList<String>();
		
		ll.add(("Naveen"));
		ll.add(("Naveen54"));
		ll.add(("Naveen2"));
		ll.add(("Naveen90"));
		ll.add(("Naveen4"));
		ll.add(null);
		
		List <String> ll2 = new ArrayList<String>();
		ll2.addAll(Arrays.asList(new String[] {"Iam", "naveen", "for"}));
	    
		System.out.println(ll);
//		Collections.sort(ll);
//		System.out.println("*********");
//		System.out.println(ll);
//		System.out.println("*********");
		
		Iterator<String> it = ll.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			System.out.println(s);
		}
		
	}

}
