package chap01;

import java.util.Scanner;

public class Q2 {
	static int binSearch(int[]a, int n, int k) {
	
		
		System.out.print(" | ");
		for(int i = 0; i<n; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.print("-+-");
		for(int i = 0; i<n; i++) {
			System.out.print("--");
		}
		System.out.println();
		for(int i =0; i<a.length-1;i++) {
			System.out.print(" | ");
			for(int j=0;j<=i;j++) {
				System.out.print(" ");
			}
			System.out.print("* ");
//			
			System.out.println();
			System.out.print(" | ");
			for(int j=0;j<a.length-1;j++) {
				System.out.print(a[j]+" ");
			}
			System.out.println();
			if(a[i]==k) {
				return i;
			}
		}
		
		return -1;
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
		
		int result=binSearch(x,num,key);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("x["+result+"]에 있습니다.");
			
		}
	}

}
