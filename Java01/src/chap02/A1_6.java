package chap02;

import java.util.Scanner;

public class A1_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = -5;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("nÀÇ °ªÀº");
			n = sc.nextInt();
		}while(n<=0);
		
		for(int i =1; i<=n; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}