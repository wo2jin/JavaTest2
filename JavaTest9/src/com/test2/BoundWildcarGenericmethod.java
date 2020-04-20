package com.test2;
class Box4<T>{
	private T o;
	public void set(T o) {this.o =o;}
	public T get() {return this.o;}
}

class Toy3{
	@Override
	public String toString() {
		return "I am a Toy.";
	}
}

class Robot{
	@Override
	public String toString() {
		return "I am a Robot";
	}
}
class BoxHandler3{
	public static<T> void outBox(Box4<? extends T> box) {
		T t = box.get();
		System.out.println(t);
	}
	public static<T> void inBox(Box4<? super T> box, T n) {
		box.set(n);
	}
}
public class BoundWildcarGenericmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box4<Toy3> tBox = new Box4<>();
		BoxHandler3.inBox(tBox, new Toy3());
		BoxHandler3.outBox(tBox);
		

	}

}
