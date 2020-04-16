package com.test;

interface Animal2{
	void breath();
}
interface Insect{
	void breath();
}
class Beetle implements Animal2, Insect{
	public void breath() {
		System.out.println("Breath beetle");
	}
}
public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal2 a = new Beetle();
		a.breath();
		Insect a2= new Beetle();
		a2.breath();
	}

}
