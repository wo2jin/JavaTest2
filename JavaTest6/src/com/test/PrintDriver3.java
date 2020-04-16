package com.test;

interface Printable2{
	void print(String doc);
}
interface ColoPrintable extends Printable2{
	void printCMYK(String doc);
}

class Prn909Drv implements ColoPrintable{
	public void print(String doc) {
		System.out.println("form MD-909 black & white ver");
		System.out.println("doc");
	}
	public void printCMYK(String doc) {
		System.out.println("form MD-909 CMYK ver");
		System.out.println("doc");
	}
}

public class PrintDriver3 {
	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		ColoPrintable prn = new Prn909Drv();
		prn.print(myDoc);
		System.out.println();
		prn.printCMYK(myDoc);
	}

}
