package com.test2;
interface Printable{
	void print(String s);
}
public class Lambda3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable prn = (s) -> {System.out.println(s);};
		prn.print("whai is Lambda?");

	}

}
