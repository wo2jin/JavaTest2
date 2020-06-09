package chap01;

import java.util.*;
public class p1 {
	static int max(int[] a) {
		int max = a[0];
		for(int i=1;i < a.length;i++) {
			if(a[i]>max) {
				max = a[i];
			}
		}
		return max;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a =  {1,2,3,4,5};
		int a2[] = {1,2,3,4,5};
		//차이는 없음 혼란때문에 int[] a를 더사용많이함
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람수");
		int num = sc.nextInt();
		int[] height = new int[num];
		
		for(int i=0;i<num;i++) {
			height[i] = 100+rd.nextInt(99);
			System.out.println(height[i]);
		}
		System.out.println("====");
		System.out.println(max(height));
	}

}
