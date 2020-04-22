// 클래스와 객체(인스턴스)의 차이점
// 클래스(코드), 객체(메모리 클래스가 적재된것)

//객체 지향 프로그램밍의 3가지 특징
//캡슐화 - 속성(상태 or 데이터), 메소드(동작 or 행위) 하나 묶는것. 코드에서는 클래스를 통해서 구성하는 방법.
//       data hide -> 멤버변수들을 private접근자로 변경 ->메소드를 통해서 호출
//상속화 - 이미 정의된 상위 클래스(부모클래스)의 모든 속성과 메소드를 하위 클래스(자식 클래스)가 사용할수 있도록 하는 기능
//		 코드를 재사용해서 사용가능하도록 한다.
//다형성 - 객체가 연산을 수행하게 될때 동일한 메소드에 대해서 각각의 객체가 가지고 있는 특성을 나타내는 방법.
//		 상속관계가 되어야함. Override 통해서 구현
package com.test2;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int j=1;
		
		for(j =1; j<10; j++) {
			for(int i =2; i<10; i++) {
				System.out.print(i+" x "+j+" = "+(i*j) +"\t");
			}
			System.out.println();
		}
		

	}

}
