package com.test1;

import java.util.function.*;

interface Database2{
	public void open(String dbName);
}
public class Test6 {
	static void check(Predicate<Integer> s, int a) {
		System.out.println(s.test(a));
	}
	public static void main(String[] args) {
		Database2 db = (dbName) ->{
			System.out.println(dbName+" open");
		};
		db.open("db");
		
		Consumer<String> o = (dbName) ->{System.out.println(dbName+" open");};
		o.accept("Database");
	}

}
