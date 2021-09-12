package com.example.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		Student s1 = new Student(101, "Kim", 23);
		Student s2 = new Student(102, "Lee", 21);
		Student s3 = new Student(103, "Park", 25);
		Student s4 = new Student(104, "Choi", 24);
		Student s5 = new Student(105, "jeong", 26);
		Student s6 = new Student(106, "Lim", 20);
		Student s7 = new Student(107, "Gang", 29);
		Student s8 = new Student(108, "Oh", 27);
		Student s9 = new Student(109, "Son", 28);
		Student s10 = new Student(110, "Yu", 22);
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		list.add(s7);
		list.add(s8);
		list.add(s9);
		list.add(s10);
		
		Collections.sort(list);
		
		System.out.println("Student List (ordered by name)");
		
		for(Student s : list) {
			System.out.println(s.toString());
		}
		
		System.out.println("Student List (reverse ordered by name)");
		
		Collections.sort(list, Collections.reverseOrder());
		for(Student s : list) {
			System.out.println(s.toString());
		}
	}
}
