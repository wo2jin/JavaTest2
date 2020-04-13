package com.test;

class Calculator{
	int result;
	public Calculator() {
		result =0;//result값을 계속 0으로 초기화하고 계산 값을 다시 새로 입력받는다.
	}
	
	int add(int a, int b) {
		int result = a + b;
		return result;
	}
	int substract(int a, int b) {
		int result = a - b;
		return result;
	}
	//Method Overloaing 같은 메소드명이여도 탑입이 달라 2개가 존재 가능
	int add(int a, int b, int c) {
		int result = a + b +c;
		return result;
	}

}
public class Test3 {
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(1,2));
		System.out.println(cal.substract(5, 1));
		System.out.println(cal.add(1,2,3));
		
	}

}
