package com.test;

class Student2{
	String name;
	int age;
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}

public class Test5 {
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("ȫ�浿");
		stu.setAge(20);
	}

}
