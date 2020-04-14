package com.test2;

class A{
   void aMethod() {
      System.out.println("aMethod");
   }
}
class B extends A{
   void bMethod() {
      System.out.println("bMethod");
   }
}
public class Test1 {

   public static void main(String[] args) {
      B b = new B();
      String className = b.getClass().getSimpleName(); //객체이름 뽑기
      System.out.println(className);
      if(className.equals("B")) {
         System.out.println("B O.K");
      }
      if(b instanceof B) {  //참조변수가 참조하는 인스턴스의 클래스나 상속하는 클래스를 묻는 연산자
         System.out.println("B O.K2");
      }
      boolean check1 = b instanceof A;
      System.out.println(check1);
   }

}