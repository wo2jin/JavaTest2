package com.test2;

import java.util.*;

class SlenComp implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.length() - o2.length();
	}
	
}
public class SlenComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list =new ArrayList();
		list.add("Robot");
		list.add("Lambda");
		list.add("Box");
		
		Collections.sort(list, new SlenComp());
		
		for(String s: list)
			System.out.println(s);
	}

}
