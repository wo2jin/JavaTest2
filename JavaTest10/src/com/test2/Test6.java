package com.test2;
interface Animal5{
//	void breath();
	String eat(String food); //람다는 인터페이스에서 하나의 정의된 메소드만 사용 가능하다 
}
//class Dog5 implements Animal5{
//	public void breath() {
//		System.out.println("Dog");
//	}
//}
//class Cat5 implements Animal5{
//	public void breath() {
//		System.out.println("Cat");
//	}
//}
public class Test6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Dog5 d = new Dog5();
//		d.breath();
//		Cat5 c = new Cat5();
//		c.breath();
//		
//		Animal5 a= new Animal5() {//interface선언후 바로 객체선언후 한방에 이용하겠다.
//			public void breath() {System.out.println("Dog");}
//		};
//		a.breath();
//		
//		Animal5 a1= new Animal5() {
//			public void breath() {System.out.println("Cat");}
//		};
//		a1.breath();
//		
//		Animal5 a2 = () -> {System.out.println("Bark");}; //()를 통해 메소드 유추 , ()는 함수형 언어이다. 
//		a2.breath(); //부르는 메소드에 ()안에 메소드가 없다면 위에 람다식도 없어야한다.
		Animal5 a3 = (s)->{System.out.println("DOG"); return"";};
		a3.eat("저녁");
	}

}
