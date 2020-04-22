package com.test2;
class Calc{
	public int add(int a, int b) {
//		int c = a+b;
//		return c;
		return a+b;
	}
	public static int subtract(int a, int b) {
		return a-b;
	}
}
public class Test2 {
	static int add2(int x, int y) {
		return x+y;
	}
	public static void main(String[] args) {
		Calc c = new Calc();
		int r = c.add(2, 3);
		System.out.println(r);
		int r2 = Calc.subtract(3,1);
		System.out.println(r2);
		int r3 = c.subtract(6,4);
		System.out.println(r3);
		add2(4,3);
		Test2.add2(2, 4);
	}

}
