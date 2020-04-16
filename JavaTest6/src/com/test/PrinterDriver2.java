package com.test;
interface Printable{
	void print(String doc);
}
class Prn204Drv implements Printable{
	public void print(String doc) {
		System.out.println("form MD-204 printer");
		System.out.println("doc");
	}
}
class Prn731Drv implements Printable{
	public void print(String doc) {
		System.out.println("form MD-731 printer");
		System.out.println("doc");
	}
}
public class PrinterDriver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String myDoc = "This is a report about...";
		
		Printable prn = new Prn204Drv();
		prn.print(myDoc);
		System.out.println();
		
		prn = new Prn731Drv();
		prn.print(myDoc);
	
	}

}
