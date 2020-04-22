//javac Test.java -> Test5.class
//java Test5 "이순신" "강감찬"
package com.test1;

public class Test5 {
	//Run Configurations -> Arguments 에서 값을 입력해놓으면 String[] args 안에 들어가면서 자동실행
	public static void main(String[] args) { 
		//Stringp[] args = {"이순신","홍길동"}
		
		System.out.println("Hello, java");
		for(int inx = 0; inx < args.length; inx++) {
			System.out.println(args[inx]);
		}
	}

}
