package com.qa.javacodes.Arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Joinig2Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		String s1 [] = {"naveen", "Mounika", "Adhya"};
		String s2 [] = {"naveen11", "Mounika22", "Adhya1122"};
		
//adding 2 String Arrays:
		Stream<String> st1 =  Arrays.stream(s1);
		Stream<String> st2 =  Arrays.stream(s2);	
		
		//	String s3[] = Stream.concat(st1,st2).toArray(size -> new String[size]);    --direct way	
		
		Stream<String> st4 = Stream.concat(st1, st2);
		String s3[] = st4.toArray(size -> new String[size]);   // dynamic size allocation using lamda expression
		
//prting Array		
		for(String st : s3) {
			System.out.print(st + " ");
		}

//For int array: adding 2 integers
		System.out.println("---------------------------");
		int a[] = {4,6,8,9,3,6};
		int b[] = {1,2,7,5};
		
		IntStream a1 = Arrays.stream(a);
		IntStream b1 = Arrays.stream(b);		
		IntStream c = IntStream.concat(a1, b1);
		
		int d[] = c.toArray();
		Arrays.sort(d);
		
		for(int i : d) {
			System.out.print(i + " ");
		}
		
//avoid duplicates using hashset		
		System.out.println("----remove duplicates-----in d");
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i1 : d) {
			set.add(i1);
		}
		
		Iterator<Integer> it = set.iterator();
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}

//printing duplicates are:
		System.out.println(" ");
		System.out.println("printing duplicates");
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		for(int i2 : d) {
			Integer count = hm.get(i2);
			
			if(count == null) {
				hm.put(i2, 1);
			}else {
				hm.put(i2, ++count);
			}
		}
		
//printing hashmap
		Set<Entry<Integer,Integer>> ent = hm.entrySet();
		
		for(Entry<Integer, Integer> e : ent) {
		
			if(e.getValue()>1) {
				System.out.print("Duplicates are : "+e.getKey() + " " + e.getValue());
			}
		}
		
		
	}
}

