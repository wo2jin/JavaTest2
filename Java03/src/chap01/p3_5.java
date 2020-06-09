package chap01;
import java.util.Arrays;
import java.util.Scanner;

public class p3_5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 :");
		int num = sc.nextInt();
		int[] x = new int[num];
		
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
		
		int result = Arrays.binarySearch(x, key);
		if(result<0) {
			System.out.println(result);
		}else {
			System.out.println("x["+result+"]에 있습니다.");
	
		}
	}

}
