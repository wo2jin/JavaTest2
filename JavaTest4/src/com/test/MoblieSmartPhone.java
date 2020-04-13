package com.test;
class MobilePhone{
	protected String number;
	
	public MobilePhone(String num) {
		number = num;
	}
	
	public void answer() {
		System.out.println("Hi form "+number);
	}
	
}

class SmartPhone extends MobilePhone{
	private String androidVer;
	
	public SmartPhone(String num, String ver) {
		super(num);
		androidVer = ver;
	}
	
	public void playApp() {
		System.out.println("app is running is "+androidVer);
	}
}

public class MoblieSmartPhone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone phone = new SmartPhone("010-2732-7490","Nougat");
		phone.answer();
		phone.playApp();
	}

}
