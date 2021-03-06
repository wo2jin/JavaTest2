package com.test2;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{}
class C extends A{}


public class Test11 {
	static void testMethod(List<?> els) {
		for (Object o : els) {
			System.out.println(o);
		}
	}
	static <T  extends A> void testMethod2(List<T> els) {
		for (Object o : els) {
			System.out.println(o);
		}
	}
	public static void main(String[] args) {
		List<A> aList = new ArrayList<A>();
		List<B> bList = new ArrayList<B>();
//		aList = bList//A /B 타입이 다르기 때문에 불가능List<?>를통해 어던 타입도 불러들이게 가능한 메소드
		testMethod(aList);
		testMethod(bList);
		testMethod2(aList);
		testMethod2(bList);
		
		List<?> list1 = new ArrayList<A>();
		List<? extends A> list2 = new ArrayList<A>();
		List<? super A> list3 = new ArrayList<A>();
	}
}
