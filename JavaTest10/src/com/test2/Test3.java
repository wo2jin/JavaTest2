package com.test2;

public class Test3 {
	static void test1(String[] str) { //String[] str =a; array타입이기때문에 array타입만 받을수있다.
		for(int inx =0; inx < str.length; inx++) {
			System.out.println(str[inx]);
		}
	}
	static void test2(String...str2) { //String str ={"1","2","3","4"} //array타입이기때문에 array타입만 받을수있다.
		for(int inx =0; inx < str2.length; inx++) {
			System.out.println(str2[inx]);
		}
	}
	public static void main(String[] args) {
		String[] a = {"1","2","3","4"};
		test2("1","2","3","4");
		test1(a); //array타입이기때문에 array타입만 받을수있다.

	}

}
