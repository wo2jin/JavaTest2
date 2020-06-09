package chap01;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class Q4 {
	static void copy(int[] a, int[] b) {
		for(int i = 0; i<a.length;i++) {
			b[i] = a[i];
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
