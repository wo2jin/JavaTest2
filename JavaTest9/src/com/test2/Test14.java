package com.test2;

interface IAnimal4<T>{
	void set(T t);
	T get();
	void Breath();
}

class Animal4<T> implements IAnimal4<T>{
	T animal;
	@Override
	public void set(T t) { this.animal = t;}
	@Override
	public T get() {return this.animal;}
	@Override
	public void Breath() {System.out.println("Animal breath");}
}

class Dog4{}
public class Test14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal4<Dog4> a = new Animal4<Dog4>();
		a.set(new Dog4());
		Dog4 a1 = a.get();
	}

}
