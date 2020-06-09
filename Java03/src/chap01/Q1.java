package chap01;

import java.util.Scanner;

public class Q1 {
	static int binSearch2(int[] x,int n,int k) {
		int pl = 0;
		int pr = n-1;
		int i=0;
		int pc;
		for(int j =0;j<n-1/2;j++) {
			pc = (pl+pr)/2;
			if(x[pc]==k) {
				return pc;
			}else if(x[pc]<k){
				pl = pc+1;
			}else{
				pr = pc-1;
			}
		}return -1;
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
		
		int result=binSearch2(x,num,key);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("x["+result+"]에 있습니다.");
			
		}
	}
	

}
