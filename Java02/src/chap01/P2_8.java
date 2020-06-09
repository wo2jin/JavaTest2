package chap01;
import java.util.*;
public class P2_8 {
	static int cardConvr(int x,int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++]= dchar.charAt(x%r);
			x/=r;
		}while(x!=0);
		return digits;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		char[] cno = new char[32]; //자리수 [.......] / [1,0,1,.....]
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.println("변환하는 음이 아닌정수");
		no = sc.nextInt();
		System.out.println("진수 선택(2~36)");
		cd = sc.nextInt();
		dno = cardConvr(no, cd, cno);
		System.out.println("==결과==");
		for(int i = 0; i<dno; i++) {
			int n = dno-1;
			System.out.print(cno[n-i]);
		}
	}

}
