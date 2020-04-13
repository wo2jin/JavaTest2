package com.test2;

class A{
//	final void aMethod() {System.out.println("aMethod");} //파이널이 붙으면 상속 불가능하게함
	void aMethod() {System.out.println("aMethod");}
}
class B extends A{
	void bMethod() {System.out.println("bMethod");}
	void aMethod() {System.out.println("aMethod on B class");}
}
class C extends B{
	void cMethod() {System.out.println("cMethod");}
//	void aMethod() {System.out.println("aMethod on C class");}
}
public class Test1 {
	
	public static void main(String[] args) {
		A a = new C();
		a.aMethod();
		
	}

}
