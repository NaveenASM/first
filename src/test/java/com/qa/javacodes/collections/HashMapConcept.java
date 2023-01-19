package com.qa.javacodes.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;




public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      hashM();
      System.out.println("--------");
		hashM234();
	}
	
	
	public static void hashM234() {
	
		Map<Integer,String> m1 = new HashMap<Integer,String>();
		m1.put(null, null);
		m1.put(1, null);
		m1.put(2, "naveen");
		m1.put(3,"naveen");
		m1.put(3, "madhu");
		
		for(Map.Entry<Integer, String> e1 : m1.entrySet()) {
			System.out.println(e1.getKey() + " " + e1.getValue());
			
		}		
		
	}
	
	public static void hashM() {
		Employee e1 = new Employee(null, 33, "IT");
		Employee e2 = new Employee("naveen1", 34, "IT1");
		Employee e3 = new Employee("naveen2", 35, "IT2");
		
		//Map<Integer,Employee> m = new HashMap<Integer,Employee>();
		Map<Integer,Employee> m = new HashMap<Integer,Employee>();
		m.put(1, e1);
		m.put(2, e2);
		m.put(3, e3);
		//m.put(4, "separate");
		
		//traversing		
		for(Entry<Integer, Employee> e : m.entrySet()) {
			int i = e.getKey();
			Employee ee = e.getValue();
			System.out.println(i + " " + ee.name + " " + ee.age + " " + ee.dept);
			
			
		}
			
	}

}
