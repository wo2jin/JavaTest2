package chap02;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Q15 {
	static void triangleLb(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//왼쪽 위가 직각인 이등변 삼각형
	static void triangleLu(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j =5; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//오른쪽위가 지각인 이등변 삼각형
	static void triangleRu(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j= 1; j<=i-1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//오른쪽 아래가 지각인 이등변 삼각형
	static void triangleRb(int n) {
		
		for(int i=1; i<=n;i++) {
			for(int j =0; j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j =0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Q15 a = new Q15();
//		a.triangleLb(5);
		System.out.println("========");
//		a.triangleLu(5);
		System.out.println("========");
		a.triangleRu(5);
		System.out.println("========");
		a.triangleRb(5);
	}

}
