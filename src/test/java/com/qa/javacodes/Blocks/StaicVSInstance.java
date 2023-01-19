package com.qa.javacodes.Blocks;

public class StaicVSInstance {

	static int a=10;
	int b=20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		System.out.println("main method");
		StaicVSInstance si = new StaicVSInstance();
		System.out.println(a + " "+ si.b);
	}
		
	StaicVSInstance() {
		System.out.println("In constructor");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("static block");
	}
	

}
