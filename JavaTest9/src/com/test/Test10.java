package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		al.add("�ϳ�");
		al.add("��");
		al.add("��");
		for(String s: al){
			System.out.println(s);
		}
		for(Iterator<String> itr = al.iterator(); itr.hasNext();) { //iterator �ȿ� ���� �ϳ��� ����
			System.out.println(itr.next());
		}
		List<String> al2 = new ArrayList<String>();
		al2.add("�ϳ�2");
		al2.add("��2");

	}

}
