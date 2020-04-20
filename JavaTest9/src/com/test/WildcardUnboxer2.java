package com.test;
class Box11<T>{
	private T o;
	public void set(T o) {
		this.o =o;
	}
	public T get() {
		return this.o;
	}
	@Override
	public String toString() {
		return this.toString();
	}
}

class Unboxer4{
	public static <T>T openBox(Box10<T> box){
		return box.get();
	}
	public static void peekBox(Box10<?> box) {
		System.out.println(box);
	}
}
public class WildcardUnboxer2 {

	public static void main(String[] args) {
		Box10<String> box = new Box10<>();
		box.set("So simple String");
		Unboxer4.peekBox(box);
	}

}
