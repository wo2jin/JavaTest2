package com.test3;
class School{
	String name;
	int age;
	public School() {}
	public School(String aheight) {
		System.out.println("학교 졸업");
	}
	void getInfo(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println(this.name+","+this.age+"학생입니다.");
	}

	
}
class MiddleSchool extends School{
	String grade;
	public MiddleSchool() {}
//	public MiddleSchool(String bheight){ //디폴트 생성자가 있어야지만 쓸수 있나??
//		System.out.println("학교 졸업");
//	}
	void getInfo(String name, int age,String grade) {
		super.name = name;
		super.age = age;
		this.grade = grade;
		System.out.println(this.grade+","+super.name+","+super.age+"고등학생입니다.");
	}
}
class highSchool extends MiddleSchool{
	
	public highSchool(String cheight) {
		
	}	
}

public class Student {
	public static void main(String[] args) {
		MiddleSchool sc = new MiddleSchool();
		sc.getInfo("문일주",20,"바보");
		School sc2 = sc;
		
		sc2.getInfo(sc.name,sc.age);
				
	
		
	}
}
