package com.test2;
class Box<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
	public String toString() {
		return this.o.toString();
	}
}

class Unboxer{
	public static void peekBox(Box<? extends Number> box) {
		System.out.println(box);
	}
}

class UpperBoundedWildcard{
	public static void main(String[] args) {
		Box<Integer> iBox = new Box<>();
		iBox.set(1234);
		Box<Double> dBox = new Box<>();
		dBox.set(10.009);
		
		
		Unboxer.peekBox(iBox);
		Unboxer.peekBox(dBox);
	}
}

