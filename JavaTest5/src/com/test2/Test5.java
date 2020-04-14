package com.test2;

public class Test5 {
	public static void main(String[] args) {
		int[] arr = new int[3];
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		for(int inx = 0; inx < arr.length; inx++) {
		}
		for(int a : arr) { //for each구문 위에 for문과 같이 배열 안에 있는 모든 요소를 for을 통해 반복함
			System.out.println(a);
		}
		
		String[] strs = {"이순신","홍길동","강감찬"};
		for(String nm : strs) {
			System.out.println(nm);
		}
		
	}

}
