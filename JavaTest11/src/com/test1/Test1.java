package com.test1;

import java.util.*;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		ArrayList<String> al1 = new ArrayList<>();
		al1.add("A");
		al1.add("B");
		al1.add("C");
		al1.add("D");
		
		for(int inx = 0; inx < al1.size(); inx++) {
			System.out.println(al1.get(inx));
		}
		for(String s : al1) {
			System.out.println(s);
		}
		
		Iterator<String> lts = al1.iterator();
		while(lts.hasNext()) {
			System.out.println(lts.next());
		}
		
		HashSet hs = new HashSet();
		hs.add("B");
		hs.add("A");
		hs.add("A");
		System.out.println(hs);
		HashSet<String> hs2 = new HashSet<>(); //중복되는 정보를 하나로 처리
		hs2.add("C");
		hs2.add("B");
		hs2.add("B");
		Iterator<String> hslts = hs2.iterator();
		while(hslts.hasNext()) {
			System.out.println(hslts.next());
		}
		// map k, v -> dictionary
		Map map = new HashMap();
		map.put(1, "one");
		map.put(3, "three");
		map.put(1, "two");
		Set set = map.entrySet();
		Iterator lts2 = set.iterator();
		while(lts2.hasNext()) {
			Object o = lts2.next();
			Map.Entry e  = (Map.Entry)o;
			System.out.println(e.getKey()+","+e.getValue());
		}
		
		Map<Integer, String> map2 = new HashMap<>();
		map2.put(1, "Test1");
		map2.put(2, "Test2");
		for(Map.Entry m : map2.entrySet()) {
			System.out.println(m.getKey()+","+m.getValue());
		}
		
	}

}
