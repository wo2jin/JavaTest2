package com.test;

import java.util.*;



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l1 = new ArrayList<String>();
		List<String> l2 = new LinkedList<String>();
		List<String> l3 = new Vector<String>();
		List<String> l4 = new Stack<String>();
		l1.add("add");
		l1.add("appleersdf");
		l1.add("appledd");
		l2.add("add");
		System.out.println("===iterator===");
		Iterator<String> ltr = l1.iterator(); 
		while(ltr.hasNext()) { //iterator�� �ݷ����� Ư���� ������ ����(?)
			System.out.println(ltr.next());
		}
		System.out.println("===list����===");
		for(int inx =0; inx < l1.size(); inx++) { //����Ʈ ���·μ� �����ϸ� for����� ����� ���� ������ ��Ҹ� ����
			System.out.println(l1.get(inx));
		}
		System.out.println("===String s:l1====");
		for(String s : l1) {
			System.out.println(s);
		}
		System.out.println("-sort=");
		Collections.sort(l1);
		for(String s: l1) {
			System.out.println(s);
		}

	}

}
