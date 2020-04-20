package com.test;
class Box4<T extends Number>{
	private T o;
	
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
public class BoundedBox {

	public static void main(String[] args) {
		Box4<Integer> i = new Box4<Integer>();
		i.set(24);
		
		Box4<Double> d = new Box4<Double>();
		d.set(5.97);
		
		System.out.println(i.get());
		System.out.println(d.get());

	}

}
