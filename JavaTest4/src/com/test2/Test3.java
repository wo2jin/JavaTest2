package com.test2;

interface Cake2{
	public void showCakeSize();
}
class CheeseCake2 implements Cake2{
	@Override
	public void showCakeSize() {
		System.out.println("CheeseCake");
	}
}
public class Test3 {
	public static void main(String[] args) {
		CheeseCake2 c = new CheeseCake2();
		c.showCakeSize();
		Cake2 c2 = new CheeseCake2();
		c2.showCakeSize();
		
	}

}
