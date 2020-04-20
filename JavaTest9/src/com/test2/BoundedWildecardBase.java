package com.test2;
class Box2<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
class Toy{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler{
	public static void outBox(Box2<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}
	public static void inBox(Box2<Toy> box, Toy n) {
		box.set(n);
	}
}
public class BoundedWildecardBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box2<Toy> box = new Box2<>();
		BoxHandler.inBox(box,new Toy());
		BoxHandler.outBox(box);
	}

}
