package chap02;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a= 0;
		int b= 0;
//		do {
//			System.out.println("a :");
//			a = sc.nextInt();
//			System.out.println("b :");
//			b = sc.nextInt();
//			
//		}while(a<b){
//			System.out.println();
//		};
		
		while(true) {
			System.out.println("a :");
			a = sc.nextInt();
			System.out.println("b :");
			b = sc.nextInt();
			if(a<b) {
				break;
			}
			else {
				System.out.println("b값이더커야함");
			}
		}
	
		int sum = 0;
		for(int i=a;i<=b;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
