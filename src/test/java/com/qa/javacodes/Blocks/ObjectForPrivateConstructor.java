package com.qa.javacodes.Blocks;

public class ObjectForPrivateConstructor {

	int a = 20;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private ObjectForPrivateConstructor() {
		this.a =10;
		System.out.println(this.a);
	}
	
	static {
		ObjectForPrivateConstructor pc = new ObjectForPrivateConstructor();
		pc.a =30;
		System.out.println(pc.a);
	}
	
	public static void sm() {
		
	}
	
	

}
