package com.test;
class Student{
	String name;
	public void gotoSchool() {
		System.out.println("Student go to school");
	}
	
	public void study() {
		System.out.println("Student study");
	}
}

class MiddleStudent extends Student{
	public void study2() {
		System.out.println("MiddleStudent study");
	}
}


public class Test4 {
	public static void main(String[] args) {
		MiddleStudent mstu = new MiddleStudent();
		mstu.gotoSchool();
		mstu.study();
		mstu.study2();
	}

}
