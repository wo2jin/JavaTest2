package com.test2;
interface Calculator{
	int add(int x, int y);
}
public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = (a,b)->{ int d = a+b; return d;};
		System.out.println(c.add(1, 2));
		int r = c.add(2, 3);
		System.out.println(r);
	}

}
