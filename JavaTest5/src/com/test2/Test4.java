package com.test2;
class Box3 extends Object{//objectd는 박스의 상위 타입
	String name;
	public Box3(String name) {
		this.name = name;
	}
	public String toString(){
		return this.name;
	}	
}

public class Test4 {
	static void test(Object o) {
		o.toString();
	}
	public static void mian(String[] args) {
		Box3[] arrBoxes = new Box3[2];
		arrBoxes[0] = new Box3("빨간색");
		arrBoxes[1] = new Box3("하얀색");
		System.out.println(arrBoxes[0]);
		System.out.println(arrBoxes[1]);
		test(arrBoxes[0]);
		test(arrBoxes[1]);
		
	
		
	}

}
