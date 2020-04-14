package com.test2;
class Animal{}
class Dog extends Animal{
//	static void method(Animal a){
//		
//	}
}

public class Test2 {

	public static void main(String[] args) {
		Animal a = new Dog();
		if(a instanceof Dog) {
			Dog d= (Dog)a;
		}
		

	}

}
