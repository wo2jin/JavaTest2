package com.test;

class Student{
	//member variables
	protected String name;
	protected int age;
	//constructors
	public Student() {
		this.name = "홍길동";
		this.age = 20;
	}
	//constructors overloading
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//member methods
	public void studying() {
		System.out.println("Student Studying");
	}
	public void studying(String msg) {
		System.out.println("Student Studying"+msg);
	}
}

class MiddleStudent extends Student{
	int grade;
	public MiddleStudent() {
		this.name = "이순신";
		this.age = 40;
		this.grade = 50;
	}
	public MiddleStudent(String name, int age, int grade) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.grade = grade;	
		System.out.println(this.name+this.age+this.grade);
	}
	public void playingGame() {
		System.out.println("MiddleStudnet playingGame");
	}
}
public class Test2 {
	public static void main(String[] args){
		Student stu = new Student();
		MiddleStudent  midstu = new MiddleStudent();
		MiddleStudent  midstu2 = new MiddleStudent("문일주",27,1);
		midstu2.playingGame();
		
		Student midstu3 = new MiddleStudent("권율",50,4);
		midstu3.studying();
		
	}
	
}
