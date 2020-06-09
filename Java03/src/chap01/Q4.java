package chap01;

import java.util.Scanner;

public class Q4 {
	static int binSearchEx(int[] a, int n, int key) {
		System.out.print("   |");
		for (int k = 0; k < n; k++)
			System.out.printf("%4d", k);
		System.out.println();

		System.out.print("---+");
		for (int k = 0; k < 4 * n + 2; k++)
			System.out.print("-");
		System.out.println();

		int pl = 0; // 검색범위 맨 앞의 index
		int pr = n - 1; // 검색범위 맨 뒤의 index

		do {
			int pc = (pl + pr) / 2; // 중앙요소의 index
			System.out.print("   |");
			if (pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", pc * 4 + 1), "");
			if (pc != pr)
				System.out.printf(String.format("%%%ds->\n", (pr - pc) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", pc);
			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if (a[pc] == key)
				return pc; // 검색성공
			else if (a[pc] < key)
				pl = pc + 1; // 검색범위를 뒤쪽 절반으로 좁힘
			else
				pr = pc - 1; // 검색범위를 앞쪽 절반으로 좁힘
		} while (pl <= pr);
		return -1; // 검색실패
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
		
		int result=binSearchEx(x,num,key);
		if(result==-1) {
			System.out.println("찾는값이 없습니다.");
		}else {
			System.out.println("x["+result+"]에 있습니다.");
			
		}
	}

}
