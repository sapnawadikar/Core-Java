package com.constructor;

public class School {
	public static void main(String[] args) {

		Student s1 = new Student();
		 Student s2 = new Student(101, "Rahul Patil", "Computer Science");
	        s1.display();
		s2.display();

	}
}