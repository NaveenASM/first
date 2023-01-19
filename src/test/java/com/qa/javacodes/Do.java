package com.qa.javacodes;

import java.util.HashMap;

public class Do {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "naveen";
				
		String s1[] = s.split("");
		
		HashMap<String,Integer> hm = new HashMap<String, Integer>();
		
		for(String s2 : s1)
		{
			Integer count = hm.get(s2);
			if(count == null)
			{
				hm.put(s2, 1);
			}else 
				{
				hm.put(s2, ++count);
				}
		}
		

		
	}
	


}
