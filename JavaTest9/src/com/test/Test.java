package com.test;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4};
		
		for(int inx = 0; inx < arr.length; inx++) {
			System.out.println(arr[inx]);
		}
		
		ArrayList al = new ArrayList();
		al.add(1);
		al.add("test");
		
		System.out.println(al.get(0));
		System.out.println(al.get(1));
		al.get(1);
		
		for(Object o : al) {
			System.out.println("==========");
			System.out.println(o.toString());
		}

	}

}
