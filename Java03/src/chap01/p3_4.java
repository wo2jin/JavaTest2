package chap01;

import java.util.Scanner;

public class p3_4 {
	static int binSearch(int[]a, int n, int key) {
		int pl=0;
		int pr = n-1;
		
		do {
			int pc = (pl+pr)/2;
			if(a[pc]==key) {
				return pc;
			}
			else if(a[pc]<key) {
				pl = pc+1;
			}else {
				pr = pc-1;
			}
		}while(pl<=pr);
		
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 :");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		System.out.print("x[0] :"); //x[0]이있어야지 while조건문이 성립
		x[0] = sc.nextInt();
		
		for(int i = 1; i <num; i++) {
			do {
				System.out.print("x["+i+"] :");
				x[i] = sc.nextInt();
			}while(x[i]<x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int result=binSearch(x,num,key);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("x["+result+"]에 있습니다.");
			
		}
	}

}
