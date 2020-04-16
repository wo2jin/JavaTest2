package com.test2;

public class Test4 {
	public static void main(String[] args) {
		try {
//			int a = 3;
//			int b = 0;
//			int c= a/b;	
//			System.out.println("잘됨");
			int a[] = new int[5];
			a[5]= 0;
			
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나누었습니다.");
			System.out.println(e.getMessage());
		}
//exception 아래에 파생되는 것들이 있기때문에 마지막에 exception을 놓으면 놓치는것 없이 다 받을수 있다.
//세부화 하지 않으면 어디서 예외처리가 나왔는지 알수 없다.
		catch(Exception e) {

			System.out.println(e.getMessage());
		}
	}

}
