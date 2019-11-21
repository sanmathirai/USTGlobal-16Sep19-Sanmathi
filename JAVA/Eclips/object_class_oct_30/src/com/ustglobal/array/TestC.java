package com.ustglobal.array;

public class TestC {
	public static void main(String[] args) {
	
		Student[] s =getStudent();
		 
		
		recieveStudent(s);
	}
	
	static void recieveStudent(Student[] std) {
		System.out.println("Using For each");
		for(Student s: std) {
			System.out.println(s);
		}
		System.out.println("Using for");
		for(int i = 0; i<5;i++) {
			System.out.println(std[i]);
		}

	}
	
	
	
	static Student[] getStudent() {
		Student s1 = new Student(1, "skjdksd", 78.2);
		Student s2 = new Student(2, "sanmathi", 76.2);
		Student s3 = new Student(3, "sanma", 79.2);
		Student s4 = new Student(1, "skjdksd", 78.2);
		Student s5 = new Student(2, "sanmathi", 76.2);
		
		
		Student[] std = new Student[5];
		std[0] = s1;
		std[1] = s2;
		std[2] = s3;
		std[3] = s4;
		std[4] = s5;
		return std;
		
	}

}
