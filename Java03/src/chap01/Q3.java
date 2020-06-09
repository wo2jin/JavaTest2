package chap01;

import java.util.Scanner;

public class Q3 {
	static int searchIdx(int[] a,int n,int k,int[] idx){
		int count=0;
		for(int i =0; i <a.length;i++) {
			if(a[i]==k) {
				idx[count] = a[i];
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("요솟수 :");
		int num = sc.nextInt();
		int[] x = new int[num+1];
		int[] idx = new int[num];
		for(int i = 0; i <num; i++) {
			System.out.print("x["+i+"] :");
			x[i] = sc.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int key = sc.nextInt();
		
		int result = searchIdx(x,num,key,idx);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("count : "+result);
			
		}
	}

}
