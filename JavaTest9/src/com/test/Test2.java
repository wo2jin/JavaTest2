package com.test;
class Animal<T>{
	T b;
	void breath(T b) {
		this.b = b;
	}
	T getBreath() {
		return b;
	}
}
class Dog{
	@Override
	public String toString() {
		return "Dog";
//		System.out.println("Dog bark");
	}
}
class Cat{
	void meow() {
//		System.out.println("Cat meow");
		}
}

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal<Dog> a = new Animal<Dog>();
//		Animal<Cat>	c = new Animal<Cat>();
		
		a.breath(new Dog());
		
		Dog d = a.getBreath();
		
		System.out.println(d);
	}
}


