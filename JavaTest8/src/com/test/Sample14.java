package com.test;

import java.lang.reflect.Array;
import java.util.Arrays;

class Student implements Comparable{
	int rollno;
	String name;
	int age;
	int namel;
	public Student(int rollon, String name, int age) {
		this.rollno = rollon;
		this.name = name;
		this.age = age;
		this.namel = name.length() ;
	}
	
	@Override
	public int compareTo(Object o) {
		Student s = (Student)o;
		if(this.namel==s.name.length()) {
			return 0;
		}else if(this.namel>s.name.length()) {
			return -1;
		}else {
			return 1;
		}
	}
	
}
public class Sample14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] stu = new Student[3];
		stu[0] = new Student(1,"홍길동의적",21);
		stu[1] = new Student(3,"권순빈분대장",22);
		stu[2] = new Student(2,"문일주거",24);
		Arrays.sort(stu);
		
		for(Student s : stu) {
			System.out.println(s.name);
		}
		
	}

}
