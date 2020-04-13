package com.test;
// public 접근에 제한이 없음을 표시, default 정의하지않으면 기본 default상태로 정의
//privat 자신의 클래스 내에서만 사용가능
//protected : 동일한 페키지 내에 존재하거나 파생된 클래스에서만 접근 가능
public class MyClass {
//public, private, protected, default
   public int a; // 다사용가능
   private int b; //클래스 내부에서만  사용
   protected int c;
   int d; //패키지 안에서만 사용
   public void aMethod() {}
   private void bMethod() {}
   protected void cMethod() {}
   void dMethod() {}
}