package com.qa.javacodes.collections;

public class Student {

	
	private String name;
	private int marks;
	private int rollnum;
	
	public Student(String name, int marks, int rollnum) {
		this.name = name;
		this.marks = marks;
		this.rollnum = rollnum;
	}

	public String getName() {
		return name;
	}


	public int getMarks() {
		return marks;
	}


	public int getRollnum() {
		return rollnum;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", rollnum=" + rollnum + "]";
	}

	
	
	
}
