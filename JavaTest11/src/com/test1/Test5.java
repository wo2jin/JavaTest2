//javac Test.java -> Test5.class
//java Test5 "�̼���" "������"
package com.test1;

public class Test5 {
	//Run Configurations -> Arguments ���� ���� �Է��س����� String[] args �ȿ� ���鼭 �ڵ�����
	public static void main(String[] args) { 
		//Stringp[] args = {"�̼���","ȫ�浿"}
		
		System.out.println("Hello, java");
		for(int inx = 0; inx < args.length; inx++) {
			System.out.println(args[inx]);
		}
	}

}
