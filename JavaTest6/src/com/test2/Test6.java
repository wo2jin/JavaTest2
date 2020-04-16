package com.test2;

class MyException extends Exception{
	   public MyException(){
	      super("나의 예외 처리 입니다.");
	   }
	}
	public class Test6 {

	   public static void main(String[] args) throws MyException {
	      int n = 3;
	      if(n == 3) {
	         
	         try {
	         throw new MyException();
	      }catch(MyException e) {
	         System.out.println(e.getMessage());
	      }
	     }
	   }

}
