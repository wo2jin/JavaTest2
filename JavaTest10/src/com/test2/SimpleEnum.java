package com.test2;
enum Scale{
	DO, RE, MI, FA,  SO, RA, TI
}
public class SimpleEnum {

	public static void main(String[] args) {
		Scale sc = Scale.DO;
		System.out.println(sc);
		
		switch(sc) {
		case DO:
			System.out.println("��~");
			break;
		case RE:
			System.out.println("��~");
			break;
		case MI:
			System.out.println("��~");
			break;
		case FA:
			System.out.println("��~");
			break;
		case SO:
			System.out.println("��~");
			break;
		case RA:
			System.out.println("��~");
			break;
		case TI:
			System.out.println("��~");
			break;
		default:
			System.out.println("��~��~��~");
			
		}
	}

}
