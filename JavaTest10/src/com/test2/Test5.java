package com.test2;
interface Animal{
	void breath();
}
class Dog implements Animal{
	@Override
	public void breath() {
		System.out.println("Dog Breath");
	}
}
public class Test5 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		Animal a= new Animal() {
			public void breath() { System.out.println("no");}
		}; //���� Ŭ���� �ѹ� ���� ��������
		a.breath();
	
	}

}
