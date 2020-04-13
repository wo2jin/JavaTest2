package com.test;

class A{
	int aValue;
	public A() {//static으로 접근자 설정하지 못함 / class가 호출되는 기본으로 사용되는것이라
		System.out.println("Default Constructor A");
		this.aValue =10;
	}
	public A(int aValue) {//super로 받는 상위 메소드
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class B extends A{
	int bValue;
	public B() {
		System.out.println("Default Constructor B");
		this.bValue =100;
	}
	public B(int bValue) {
		super(bValue);//상위에 오버라이드 된 메소드 public A(int aValue)값에 대값을 대입
		this.bValue = bValue;
		System.out.println("Constructor B"+bValue+","+this.aValue);
	}
}

public class Test6 {
	public static void main(String[] args) {
//		A a = new A();
		B b = new B(100);//상위클래스가 먼저 생성되고 하위클래스가 생성된다.
	
	}
}
