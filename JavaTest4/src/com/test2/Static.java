package com.test2;


class MyClass{
	static int count;//static을 붙일 경우 아래 호출에 의한 count가 공유 되기 때문에 계속해서 늘어난다.+static이 없을시 계속 새로 생성되어 초기화됨
	public MyClass() {
		count++;
		System.out.println(count);
	}
	
}

public class Static {
	public static void main(String[] args) {
		MyClass m1 = new MyClass();// m1,m2,m3,m4는 서로다른 객체이지만 static 을 통해 int count를 공유할수 있다.
		MyClass m2 = new MyClass();
		MyClass m3 = new MyClass();
		MyClass m4 = new MyClass();
		
		
	}

}
