package com.qa.javacodes.ArithmeticPrograms;

public class RemoveSpecailCahracters {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		main("@#%@4naveen*&,Mounika&^678%");
			
	}
	
	public static void main(String s) {
		String s1 = s.replaceAll("[^A-Za-z0-9]", "");
		System.out.println(s1);
		
	}

}
