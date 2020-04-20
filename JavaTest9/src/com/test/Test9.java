package com.test;
class Store<T>{
	private T t;
	public void add(T t) {
		this.t = t;
	}
	public T getValue() {
		return this.t;
	}
}
class Box9<T, S>{
	private T t;
	private S s;
	public void add(T t,S s) {
		this.t = t;
		this.s =s;
	}
	public T getFirst() {
		return this.t;
	}
	public S getTow() {
		return this.s;
	}
}

public class Test9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box9<String, Integer> b = new Box9<String, Integer>();
		b.add("홍길동", 1234);
		Box9<String, Store<String>> b2 = new Box9<String, Store<String>>();
		Store<String> s = new Store<String>();
		s.add("test");
		b2.add("이순신", s);
	}

}
