package com.qa.javacodes.ArithmeticPrograms;

public class reverseNumber {

   static int rev =0;
	public static void main(String[] args) {
		
		reverseNumber re = new reverseNumber();
		re.polindrome(1321);
		re.reverse2(54321);


	}
	
	//using Arithmetic
	public void reverse(int num) {
		
		while(num !=0){
		rev = rev*10 + num%10;
		num = num/10;
		}
		System.out.println(rev);
	}
	
	//using StringBuffer class
	public void reverse2(int n)
	{
		StringBuffer  sf = new StringBuffer(String.valueOf(n));
		System.out.println(sf.reverse());
	}
	
	
	public void polindrome(int n) {

        reverse(n);
		if (n ==rev) {
			System.out.println(n + " " +"is Polindrome");
		}else {
			System.out.println(n + " " + "is not Polindrome");
		}
	}
	


}
