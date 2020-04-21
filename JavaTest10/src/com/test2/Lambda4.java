package com.test2;
interface Printable2{
	void print(String s);
}
public class Lambda4 {
	public static void ShowString(Printable2 p, String s) {
		p.print(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShowString((s)->{System.out.println(s);},"what is Lambda?");
	}

}
