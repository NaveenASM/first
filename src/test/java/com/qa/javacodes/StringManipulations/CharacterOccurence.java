package com.qa.javacodes.StringManipulations;

public class CharacterOccurence {

	static int count =1;
	static char ev;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		occurance("Naveen mounika shanyuth Adhya Naveen mounika shanyuth Adhya", 'u');
		//printall("naveen mounika shanyuth Adhya naveen mounika shanyuth Adhya");
	}
	
	public static void occurance(String s, char val) {
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == val) {
				count = count+1;
			}		
		}
		System.out.println(val + " " + count);
	}
	

	

}
