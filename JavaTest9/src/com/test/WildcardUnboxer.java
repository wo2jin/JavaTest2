package com.test;

class Box10<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
	@Override
	public String toString() {
		return o.toString();
	}
}

class Unboxer3{
	public static<T> T openBox(Box10<T> box) {
		return box.get();
	}
	
	public static<T> void peekBox(Box10<T> box) {
		System.out.println(box);
	}
	
}

public class WildcardUnboxer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box10<String> box = new Box10<>();
		box.set("so simpel String");
		Unboxer3.peekBox(box);
	}

}
