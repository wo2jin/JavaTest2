package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("하나");
		al.add("둘");
		al.add("셋");
		for(String s: al){
			System.out.println(s);
		}
		for(Iterator<String> itr = al.iterator(); itr.hasNext();) { //iterator 안에 값을 하나씩 받음
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("하나2");
		al2.add("둘2");

	}

}
