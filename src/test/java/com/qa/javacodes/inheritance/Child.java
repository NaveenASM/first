package com.qa.javacodes.inheritance;

public class Child extends Parent{
	public void  startP() {
		System.out.println("start in Child");
	}
	
	public void  stopP() {
		System.out.println("stop in Child");
	}
	
	public void  extraC() {
		System.out.println("extra in Child");
	}
	
	//static
	public static void P() {
		System.out.println("static in Child");
	}
}
