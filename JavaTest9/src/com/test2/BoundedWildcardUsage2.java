package com.test2;
class Box3<T>{
	private T o;
	public void set(T o) {
		this.o = o;
	}
	public T get() {
		return this.o;
	}
}
class Toy2{
	@Override
	public String toString() {
		return "I am a Toy";
	}
}

class BoxHandler2{
	public static void outBox(Box3<? extends Toy2> box) {
		Toy2 t = box.get(); //���ڿ��� ������
		System.out.println(t);
	}
	public static void inBox(Box3<? super Toy2> box, Toy2 n) {
		box.set(n); //���ڿ� �ֱ�
	}
}
public class BoundedWildcardUsage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box3<Toy2> box = new Box3<>();
		BoxHandler2.inBox(box,new Toy2()) ;
		BoxHandler2.outBox(box);

	}

}
