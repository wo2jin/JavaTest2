package com.test;
class Animal4{
	void move() {
		System.out.println("Animal Move");
	}
}
class Dog2 extends Animal4{
	void move() {
		System.out.println("Dog move");
	}
}

public class Test13 {
	static void goMove(Animal4 a) {
		System.out.println("Animal Move");
		}
	public static void main(String[] args) {
		Animal4 a= new Animal4();
		a.move();
		
		Animal4 b = new Dog2();
		b.move();
		
		goMove(new Dog2());

	}

}
