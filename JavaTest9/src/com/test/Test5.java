package com.test;
class Apple3 extends Object{}

class Box2<T> extends Object{
	private Object a;
	public Box2(T a) { //Object a = new Apple();
		this.a = a;
	}
	public void set(T a) {
		this.a = a;
	}
	public Object getBox() {
		return this.a = a;
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object o = new Apple3();
		Object o1;
		o1 = new Apple3();
		Box2 b = new Box2(new Apple3()); 
		Apple3 a = (Apple3)b.getBox();
	}

}
