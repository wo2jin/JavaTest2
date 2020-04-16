package com.test2;



interface Printable2{
	void print(String doc);
	default void printCMYK(String doc) {}
}
class prn731Drv2 implements Printable2{
	public void print(String doc) {
		System.out.println("From MD-731 printer");
		System.out.println(doc);
	}
}

class Prn909Drv2 implements Printable2{
	public void print(String doc) {
		System.out.println("form MD-909 black & white ver");
		System.out.println("doc");
	}
	public void printCMYK(String doc) {
		System.out.println("form MD-909 CMYK ver");
		System.out.println("doc");
	}
}
public class PrintDriver4 {

	public static void main(String[] args) {
		String myDoc = "This is a report about...";
		Printable2 prn1 = new prn731Drv2();
		prn1.print(myDoc);
		System.out.println();
		
		Printable2 prn2 = new Prn909Drv2();
		prn2.printCMYK(myDoc);
		
		
	}

}
