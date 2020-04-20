package com.test;

import java.util.ArrayList;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("one");
		al.add("two");
		for(String s : al) {
			System.out.println(s);
		}
		ArrayList<Integer> al2  = new ArrayList<Integer>();
		al2.add(1);
		al2.add(2);
		for(int s:al2) {
			System.out.println(s);
		}
	}

}
