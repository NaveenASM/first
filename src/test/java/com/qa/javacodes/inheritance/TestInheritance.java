package com.qa.javacodes.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent p = new Child();
		p.startP();
		p.stopP();
		p.extraP();
		p.P();
		
		System.out.println("----------------");
		
		Child c = new Child();
		c.startP();
		c.stopP();
		c.extraC();
		c.extraP();
		c.P();
		
		System.out.println("----------------static");
	}

}
