package com.test1;

import java.util.function.Predicate;
interface CheckValue<T>{
	boolean test2(T a);
}

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckValue<Integer> c = (a)->{
			return(a > 18);
			};
		System.out.println(c.test2(20));
		
		Predicate<Integer> p = (a) -> (a>18); //Prdicate�� ���°��� ���Ͽ� true/false������ ��ȯ
		System.out.println(p.test(10));
	}

}
