package com.test;

import javax.swing.Box;

class Box7<T>{
	private T o;
	
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
class BoxFactory2{
	public static <T extends Number> Box7<T> makeBox(T o) {
		Box7<T> box = new Box7<T>();
		box.set(o);
		
		System.out.println("Boxed datat : "+ o.intValue());
		return box;
	}
}

class Unboxer{
	public static <T extends Number> T openBox(Box7<T> box) {
		System.out.println("Unboxed data : " + box.get().intValue());
		return box.get();
	}
}
public class BoundedGenericMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box7<Integer> sBox = BoxFactory2.makeBox(new Integer(5959));
		int n = Unboxer.openBox(sBox);
		System.out.println("return datat:"+n);

	}

}
