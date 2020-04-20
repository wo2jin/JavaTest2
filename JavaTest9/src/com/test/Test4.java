package com.test;

import java.util.ArrayList;

class Box<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T get() {
		return this.t;
	}

}
class MyArr<T>{
	private ArrayList<T> al;
	public MyArr(int size) {
		this.al = new ArrayList<T>();
	}
	public void setAl(T v) {
		al.add(v);
	}
	public T getAl(int inx) {
		return al.get(inx);
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Integer> b1 = new Box<Integer>();
		b1.add(new Integer(2));
		
		Box<String> s2 = new Box<String>();
		s2.add("Hello");
		
		System.out.println(b1.get());
		System.out.println(s2.get());

	}

}
