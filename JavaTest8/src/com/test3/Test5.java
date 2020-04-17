package com.test3;

public class Test5 {
	public static void main(String[] args) {
		String str = "test";
		String str1 = "tset";
		if(str == str1) {
			System.out.println("O.K");
		}else {
			System.out.println("no");
		}
		String str2 = new String("test");
		String str3 = new String("test");
		if(str2 == str3) { //new 로서 서로 다른 객체로 만들어져서 ==으로는 비교할수 없다
			System.out.println("O.K");
		}else {
			System.out.println("no");
		}
		if(str2.equals(str3)) { //equal는 안에 있는 그값을 비교함
			System.out.println("O.K");
		}
		else {
			System.out.println("no");
		}
	}

}
