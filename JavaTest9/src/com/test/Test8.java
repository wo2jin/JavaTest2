package com.test;

import java.net.StandardSocketOptions;

class Box8<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
class BoxFactory3{//Number를 extends한 T(형태 매개변수) , Box8<T> : 메소드 ,makeBox(T o)T의 변수를 받는 메소드,메소드 명
	public static<T extends Number> Box8<T> makeBox(T o){ 
		Box8<T> box = new  Box8<T>();
		box.set(o);
		System.out.println(o.intValue());
		return box;
		
	}
}
class UnBoxer2{
	public static<T extends Number> T openBox(Box8<T> box) {
		System.out.println(box.get().intValue());
		return box.get();
	}
}

public class Test8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box8<Integer> b8= new Box8<Integer>();
//		b8.set(new Integer(12));
		Box8<Integer> sBox = BoxFactory3.makeBox(new Integer(10));
		int n = UnBoxer2.openBox(sBox);
		System.out.println(n);
	}

}
