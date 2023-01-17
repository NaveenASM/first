package com.qa.codes.strings;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class StringManipulations {

	public static void  manipulate(String s)
	{
		//Removing special Characters
		String a= s.replaceAll("[^a-zA-Z ]", "");  //IMP
		System.out.println(a);
		
		//array
		String sa[] = a.split(""); //IMP
		
		//Storing in hm
		HashMap<String,Integer> hm = new HashMap<String,Integer>();		
		for(String si : sa)	{
			Integer count = hm.get(si);    //IMP
			if(count==null) {
				hm.put(si, 1);
			} else {
				hm.put(si, ++count);
			}
		}
		
		//printing in the console
		Set<Entry<String,Integer>> ent =  hm.entrySet();  //IMP
		
		//Duplicates
		System.out.println("duplicates are : ");
		for(Entry<String, Integer> e : ent) {			
			if(e.getValue()>1){
				System.out.println(e.getKey() + " "+ e.getValue());
			}		
		}
		
		//Total word counts
		System.out.println("Total word/Charatcter counts are:");
		for(Entry<String,Integer> ent1 : ent) {
			System.out.println(ent1.getKey() + " "+ ent1.getValue());
		}
		
		//Vowels
		System.out.println("Vowels are : ");
		for(Entry<String,Integer> e2 : ent) {
			if(e2.getKey().equals("a") || e2.getKey().equals("e") || e2.getKey().equals("i") || e2.getKey().equals("o") || e2.getKey().equals("u")) {
				System.out.println(e2.getKey() + " " + e2.getValue());
			}
		}						
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		manipulate("$#%^&nave785940eenmounika()*^%$adhya");
		///manipulate("mounika Naveen Mounika naveen Adhya shanyuth Adhya");
	}
	
}
