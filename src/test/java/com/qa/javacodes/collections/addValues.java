package com.qa.javacodes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

public class addValues {
	 public static void main(String args[])
	 {
		 //Passing Values to the Employee
		 Employee e1 = new Employee("Naveen",33,"IT");
		 Employee e2 = new Employee("Madhu",33,"CSIT");
		 Employee e3 = new Employee("kumar",33,"eeeIT");
		 
		 //Adding to the arrayList
		 ArrayList<Employee> ar = new ArrayList<Employee>();
		 ar.add(e1);
		 ar.add(e2);
		 ar.add(e3);
		 
		 //Traversing the ArrayList
		
		 Iterator<Employee> it = ar.iterator();
		 while(it.hasNext())
		 {
			 Employee emp = it.next();
			 System.out.println(emp.name +" " + emp.age + " " + emp.dept);
		 }
		 
		 System.out.println("********in ar1********");
		 //Example2
		 ArrayList<String> ar1 = new ArrayList<String>();
		 ar1.add("Naveen");
		 ar1.add("Naveen");
		 ar1.add("Madhu");
		 ar1.add("Kumar");
		 ar1.add(2, "xxx");
		 
		 for(int i=0; i<ar1.size(); i++)
		 {
			 System.out.println(ar1.get(i));
			 
		 }
		 System.out.println("end of********in ar1********");
		 
		 
		 
		 System.out.println("****************");
		 int c =0;
		 for(int i=0; i<ar.size();i++)
		 {
			 if(ar1.get(i).contains("Naveen"))
			 {
				 c = c+1;
			 }
			
		 }
		 System.out.println("Naveen" + c);
		 
		
		 
		 
		 
	 }

}
