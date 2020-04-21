package com.test2;

public class Test1 {
	enum Season{
		WINTER, SPRING, SUMMER, FALL
	}
	enum Light{
		ON	, OFF
	}
	public static void main(String[] args) {
		for(Season s : Season.values()) {
			System.out.println(s);
		}
		Season s = Season.WINTER;//스위치 온/오프 기능으로 할때 좋음
		Season s2 = Season.SPRING;
		
		System.out.println(s);
		System.out.println(s2);
		System.out.println(Season.valueOf("WINTER"));
		System.out.println(Season.valueOf("WINTER").ordinal()); //그값의 본질값?/위치값
		System.out.println(Season.valueOf("SUMMER").ordinal());
		
	}

}
