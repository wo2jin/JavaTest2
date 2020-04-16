package com.test2;

interface IAnimal{
	void breath();
}

abstract class Dog2 implements IAnimal{
	public abstract void breath();
}
class Dog3 extends Dog2{
	public void breath() {
		System.out.println("Dog3 Breath");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAnimal a = new Dog3();
		a.breath();
	}

}
