package com.test;
interface Eatable{
	public String eat();
}
class Apple2 implements Eatable{
	public String toString() {
		return "I am an aplle.";
	}
	@Override
	public String eat() {
		return "it tastes so good!";
	}
}
class Box5<T extends Eatable>{
	T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		System.out.println(this.o.eat()); //eatable로 제한하였기에 eat호출 가능
		return this.o;
	}
}
public class BoundedInterfaceBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box5 <Apple2> box = new Box5<>();
		box.set(new Apple2());
		
		Apple2 ap = box.get();
		System.out.println(ap);

	}

}
