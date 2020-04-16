package com.test2;

interface Printable{
	static void printLine(String str) {
		System.out.println(str);
	}
	default void print(String doc) {
		printLine(doc);
	}
}
class Printer implements Printable{}
public class SimplePrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String myDoc = "This is a report about...";
		Printable prn = new Printer();
		prn.print(myDoc);
		
		Printable.printLine("end od line");

	}

}
