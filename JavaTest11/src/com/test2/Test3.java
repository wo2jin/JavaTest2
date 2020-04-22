package com.test2;
class Student{
	private String name;
	private int age;
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void setName(String name, int age) {
		this.name = name;
	}
	public String getName() {//getter
		return this.name;
	}
	public void steAge(int age) {//setter
		this.age = age;
	}
	public int getAge() {return this.age;}//getter
	public void gotoSchool() {//setter
		System.out.println(name + "이 학교에간다.");
	}
}
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student("강감찬",40);
		stu.gotoSchool();
	}

}
