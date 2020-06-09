package chap01;

import java.util.Scanner;
import chap01.IntStack;

public class InStackTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		IntStack s = new IntStack(64);
		
		while(true) {
			System.out.println("현재 데이터 수: " + s.size()+"/"+s.capacity());
			System.out.println("(1)푸시 (2)팝 (3)피크 (4)덤프   \n(5)capacity (6)isEmpty (7)isFull (8)clear (0)종료");
			
			int menu = sc.nextInt();
			if(menu == 0) { break; } 
			
			int x;
			switch(menu) {
			case 1:
				System.out.print("데이터 :");
				x= sc.nextInt();
				try {
					s.push(x);
				}catch(IntStack.OverflowInStackException e) {
					System.out.println("스택이 가득 참");
				}
				break;
				
			case 2:
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 "+x+"입니다.");
				}catch(IntStack.EmptyInStackExection e) {
					System.out.println("스택이 비어있음");
				}
				break;
				
			case 3:
				
				try {
					x= s.peek();
					System.out.println("피크한 테이터는 "+x+"입니다.");
				}catch(IntStack.EmptyInStackExection e) {
					System.out.println("스택이 비어있음");
				}
				break;
			
			case 4:
				s.dump();
				break;
			case 5:
				x=s.capacity();
				System.out.println("max : "+x);
			}
			
		}
	}	

}
