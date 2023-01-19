package com.qa.javacodes.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class HighestMarks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("Naveen", 90, 32);
		Student s2 = new Student("Madhu", 70, 31);
		Student s3 = new Student("Mounika", 50, 33);
		Student s5 = new Student("Adhya", 100, 34);
		
		List<Student> li = new ArrayList<Student>();
		li.add(s1);
		li.add(s2);
		li.add(s3);
		li.add(s5);
		
		for(Student s : li) {
			System.out.println(s);
		}
	  
		System.out.println("************using streams****");
	    //streams
//		li.stream()
//			.forEach(e -> System.out.println(e));
//	    
//		//printing above 70 marks
//		li.stream()
//			.filter(e -> e.getMarks()>70)
//			.forEach(e-> System.out.println(e.getName() + " :" + e.getMarks()));
//		
//		//highest marks member
//		int hm = li.stream()
//					.map(e -> e.getMarks())
//					.max(Integer :: compare)
//					.get();
//		System.out.println(hm + ":" + "highest mark is");
//		
//		li.stream()
//			.filter(e -> e.getMarks() == hm)
//			.forEach(e -> System.out.println(e));
		
		
		
		

	}
	
	
}
