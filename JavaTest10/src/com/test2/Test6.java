package com.test2;
interface Animal5{
//	void breath();
	String eat(String food); //���ٴ� �������̽����� �ϳ��� ���ǵ� �޼ҵ常 ��� �����ϴ� 
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
//		Animal5 a= new Animal5() {//interface������ �ٷ� ��ü������ �ѹ濡 �̿��ϰڴ�.
//			public void breath() {System.out.println("Dog");}
//		};
//		a.breath();
//		
//		Animal5 a1= new Animal5() {
//			public void breath() {System.out.println("Cat");}
//		};
//		a1.breath();
//		
//		Animal5 a2 = () -> {System.out.println("Bark");}; //()�� ���� �޼ҵ� ���� , ()�� �Լ��� ����̴�. 
//		a2.breath(); //�θ��� �޼ҵ忡 ()�ȿ� �޼ҵ尡 ���ٸ� ���� ���ٽĵ� ������Ѵ�.
		Animal5 a3 = (s)->{System.out.println("DOG"); return"";};
		a3.eat("����");
	}

}
