package com.test4;

public class StringEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("so simple");
		String str2 = new String("so simple");
		//참조대상으 ㄹ비교하는 if~else문
		if(str1== str2) {
			System.out.println("str1, str2 참조 대상 동일");
		}else {
			System.out.println("str1, str2 참조 대상 다름");
		}
		// 두 인스턴스 내용을 비교하는 if~else문 /equals로 인스턴스 내용 비교
		if(str1.equals(str2)) {
			System.out.println("str1, str2 내용 동일");
		}else {
			System.out.println("str1, str2 내용 다름");
		}
	}

}
