package com.test;

class MyClass3{
	int a;
	static int b;
	public MyClass3() {
		
	}
	public static void setAvaule(int x) { //static을 이용하여 사용이 가능하다
		b = x;
	}
	public void setBvalue(int y) {
		a = y;
		setAvaule(10);
	}
}

public class Test9 {
	public static void main(String[] args) {
		MyClass3.b = 20;
		MyClass3 m = new MyClass3();
		m.a = 10;
		m.b = 20; //static은 모든 경우 처리가능
		
	}

}
