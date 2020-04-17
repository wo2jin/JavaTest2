package com.test3;
class User{
	public String id;
	public String password;
	
	@Override
	public boolean equals(Object o) { //Object o = new User();
		User user = (User)o; 
		//타입은 유저 타입이지만 object로 받았기 때문에 다시 id와password를 받기위해 user로 변환
		boolean checkFlag = false;
		if((this.id ==user.id)&&(this.password ==user.password)) {
			checkFlag = true;
		}
		return checkFlag;
	}
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User u = new User();
		u.id = "test";
		u.password = "1234";
		User u2 = new User();
		u2.id = "test";
		u2.password ="1111";
		
		Object o = new Object();
		Object o1 = new Object();
		Object o2 = o;
		
		if(o.equals(o2)) {
			System.out.println("Equal");
		}
		else {
			System.out.println("No Equal");
		}

	}

}
