package com.test;

public class Test7 {
	static <E> void printlnArr(E[] arr) {
		for(E e: arr) {
			System.out.println(e);
		}
	}

	public static void main(String[] args) {
		Integer[] arr = {1,2,3,4};
		Character[] chs = {'A','B','C'};
		printlnArr(arr); //E[] arr = arr;
		printlnArr(chs);
	}

}
