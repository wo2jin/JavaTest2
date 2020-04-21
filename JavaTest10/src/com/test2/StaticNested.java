package com.test2;

class Outer{
	private static int num =0;
	static class Nested1{ //static 네시티드 크랠스
		void add(int n){num += n;} //Outer 클래스의 static변수 공유
	}
	static class Nested2{
		int get() {return num;}
	}
}

public class StaticNested {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Nested1 nst1 = new Outer.Nested1();
		nst1.add(5);
		Outer.Nested2 nst2 = new Outer.Nested2();
		System.out.println(nst2.get());
	}

}
