package com.qa.javacodes;


public class TestingAbtract extends AbstractTest{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestingAbtract t = new TestingAbtract();
		t.test1();
		t.test2();
		System.out.println(t.i);

	}

	@Override
	void test1() {
		// TODO Auto-generated method stub
		System.out.println("abstart");
		
	}

}
