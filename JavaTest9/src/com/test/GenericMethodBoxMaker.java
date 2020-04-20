package com.test;
class Box6<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}

class BoxFactory{
	public static <T> Box6<T> makeBox(T o){
		Box6<T> box = new Box6<T>();
		box.set(o);
		return box;
	}
}

public class GenericMethodBoxMaker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box6<String> s = BoxFactory.makeBox("Sweet");
		System.out.println(s.get());
		
		Box6<Double> d = BoxFactory.makeBox(7.99);
		System.out.println(d.get());
	}

}
