package com.test;
class Apple{
	public String toString() {
		return "I am a an aplle.";
	}
}
class Orange{
	public String toString() {
		return "I am an Orange.";
	}

}

class Bos<T>{
	private T o;
	
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}

public class FruitAndBoxFault_Generic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box<Apple> a = new Box<Apple>();
		Box<Orange> o = new Box<Orange>();
		
//		a.set("Apple");//??
//		o.set("Orange");
//		a.set(new Apple());
		
		Apple ap = a.get();
		Orange og = o.get();
		
		
		
		System.out.println(ap);
		System.out.println(og);
		
		
	}

}
