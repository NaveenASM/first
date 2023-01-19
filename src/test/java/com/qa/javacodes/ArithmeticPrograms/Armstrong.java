package com.qa.javacodes.ArithmeticPrograms;

public class Armstrong {

	public static void main(String[] args) {
		
		System.out.println(isArmstrong(153));
		printArmstrong(1000);
	}
	
	public static int power(int num)
	{
		int count =0;
		while(num!=0) {
			count++;
			num = num /10;
		}
		return count;
	}
	
	public static boolean isArmstrong(int num) {
		
		if (num>=0 && num <=9) {
			return true;
		}
		
		int copynum = num;
		int power = power(num);
		int sum = 0;
		
		while(copynum !=0) {
			int lastdigit = copynum%10;  //last digit
			int factor =1;
			for(int i=0; i<power; i++) {
				factor = factor * lastdigit;   //doing *
		    }
			sum = sum + factor;
			copynum = copynum/10;  
		}	
		
		if(num == sum) {
			return true;
		}	
		return false;	
	}
	
	public static void printArmstrong(int num) {
		for(int i=100; i<=num; i++) {
			if (isArmstrong(i) == true) {
				System.out.print(i);
				System.out.println("");
			}
		}
	}

}
