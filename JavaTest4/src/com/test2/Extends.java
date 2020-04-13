package com.test2;


class one{
	int aValue;
	public one() {//static으로 접근자 설정하지 못함 / class가 호출되는 기본으로 사용되는것이라
		System.out.println("Default Constructor A");
		this.aValue =10;
	}
	public one(int aValue) {//super로 받는 상위 메소드
		System.out.println("Constructor A");
		this.aValue = aValue;
	}
}
class two extends one{
	int bValue;
	public two() {
		System.out.println("Default Constructor B");
		this.bValue =100;
	}
	public two(int bValue) {
		super(7);//상위에 오버라이드 된 메소드 public A(int aValue)값에 대값을 대입
		this.bValue = bValue;
		System.out.println("Constructor B"+bValue+","+this.aValue);
	}
}
public class Extends {
	public static void main(String[] args) {
//		one a = new one();
		two b = new two(100);//상위클래스가 먼저 생성되고 하위클래스가 생성된다.
	}

}
