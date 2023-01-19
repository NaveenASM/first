package com.qa.javacodes.StringManipulations;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DulicateWordsCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dulpicate("Naveen is Mounika and Mounika is Naveen and Shanyuth and Adhya");
		System.out.println("*************************");
		duplicate_bestWay("Naveen is Mounika and Mounika is Naveen and Shanyuth and Adhya");
		System.out.println("*************************");
		duplicate_hashSet("Naveen is Mounika and Mounika is Naveen and Shanyuth and Adhya");

	}
	
	
	public static void duplicate_bestWay(String input1) {
		
		String s[] = input1.split(" ");
		
		//Adding to hashMap --> Naveen : 2
		Map<String,Integer> hm = new HashMap<String, Integer>();
		
		for(String s1 : s) {
			Integer count = hm.get(s1);
			if(count == null) {
				hm.put(s1, 1);	
			}
			else {
				hm.put(s1, ++count);
			}
		}
		
		//printing to console using entrySet
		Set<Entry<String, Integer>> st = hm.entrySet();
		
		for(Entry<String, Integer> st1 : st) {
			if(st1.getValue()>1) {
				System.out.println(st1.getKey() + " " + st1.getValue());
			}
		}		
		
	}	
	
	public static void dulpicate(String input ) {
		
		String s[] = input.split(" ");
		
		//adding values to the HashMap
		//<Naveen, 2>
		//<Mounika, 2>
		Map<String,Integer> hm = new HashMap<String, Integer>();
		for(String str : s) {
			
			if(hm.containsKey(str)) {
				hm.put(str, hm.get(str)+1);
			}else {
				hm.put(str, 1);
			}	  
		}
		
		//printing in console
		Set<String> keys = hm.keySet();
		
		for(String str1 : keys) {
			if(hm.get(str1)>1) {
				System.out.println(str1 + ": " +  hm.get(str1));
			}
		}	
		
	}
	
	public static void duplicate_hashSet(String input2) {
		
		String s[] = input2.split(" ");
		
		Set<String> hs = new HashSet<String>();
		
		for(String st1 : s) {
			if(hs.add(st1) == false) {
				System.out.println("duplicate word is :" + st1);
			}
		}
		
		
	}

}
