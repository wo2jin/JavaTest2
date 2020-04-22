package com.test1;
interface Database{
	void open();
}
public class Test3 {
	static void test(Database d) {d.open();}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Database db = new Database(){
			public void open() {
				System.out.println("Database open");
			}
		};
		db.open();
		Database db2 = () -> {System.out.println("Databas open");};
		db2.open();
		test(db2);
		test(()->{System.out.println("Databas open");}); //db2 = ()를 static안에 d.open에 넣어버림
	}

}
