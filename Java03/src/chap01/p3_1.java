package chap01;

import java.util.Scanner;


public class p3_1 {
	static int p3_1(int[] x,int n,int k){
		int i =0;
		x[n] = k;
		//#1
//		while(true) {
//			if(i==n) {
//				return -1;
//			}
//			if(x[i]==k) {
//				return i;
//			}
//			i++;
//		}
//		
		
		
		
		//#2
//		for(int i =0; i<x.length;i++) {
//			if(x[i]==k) {
//				return i;
//			}
//			
//		}
//		return -1;
		
		
		//#3
		while(true) {
			if(x[i]==k) {
				break;
			}
			i++;
		}
		return i == n ? -1 : i;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 :");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		
		for(int i = 0; i <num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int result=p3_1(x,num,key);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("x["+result+"]에 있습니다.");
			
		}
		
	}

}
