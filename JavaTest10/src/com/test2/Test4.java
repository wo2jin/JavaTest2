package com.test2;

class School{
	private int m = 10;
	class Student{ //School과 Student를 통시에 객체화 시키지못함
		void msg() {System.out.println(m);}
	}
}
class School2{
	   private static int m = 10;
	   static class Student2{
	      void msg() {System.out.println(m);}
	   }
	}
public class Test4 {

	public static void main(String[] args) {

		School s = new School();
//		School s = new School.Student();//School과 Student를 통시에 객체화 시키지못함
//		School.Student s2 = new School.Student();
	    School.Student s3 = s.new Student();
	    s3.msg();
	      
	    School2.Student2 s4 = new School2.Student2();
	    s4.msg();
	}

}
