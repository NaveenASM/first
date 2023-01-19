package com.qa.javacodes.Examples;

public class Test2 {

	int x =10;
	int y =20;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Hello World";
		String s2 = "Hello1";
		
//		System.out.println(s1 ==s2);
//		
//		String s[] = {"naveen","madhu"};
//		System.out.println(s.length);
//		
//		main(20);  //static   main method overloaded
//		Test2 t2 = new Test2();
//		t2.test1(); //non-static
//		System.out.println(t2.x);
//		
//		t2.swap(t2);
		test2();
		
	}
	
	public static void test2() {
		Integer a= 500;
		Integer b =500;
		
		System.out.println(a ==b);
	}
	public static void main(int i)
	{
		int x =10;
		int z = x+i;
		System.out.println(z);
	}
	
	public void test1()
	{
		int p = 10+20;
		System.out.println(p);
	}
	
	public void swap(Test2 t)
	{
		int temp =0;
		temp = t.x;
		t.x = t.y;
		y = temp;
		System.out.println("************");
		System.out.println(t.x);
		System.out.println(t.y);
	}

}
