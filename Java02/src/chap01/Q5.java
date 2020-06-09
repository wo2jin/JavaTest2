package chap01;

import java.util.Scanner;

public class Q5 {
	static void copy(int[] a, int[] b) {
		int n = a.length -1;
		for(int i = 0; i<n;i++) {
			b[i] = a[n-i];
		}
		for(int i=0; i<b.length; i++) {
			System.out.print(b[i]+" ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("요솟수");
		int num = sc.nextInt();
		
		int[] a= new int[num];
		int[] b= new int[num];	
		System.out.println("int[] a를 설정");
		for(int i=0; i<num; i++){
			System.out.println(i+"번째 값");
			int value = sc.nextInt();
			a[i] = value;
		}
		copy(a,b);
	}

}
