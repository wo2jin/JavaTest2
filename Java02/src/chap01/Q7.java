package chap01;

import java.util.Scanner;

public class Q7 {
	static int cardConvr(int no,int cd, char[] cno) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(cd+"|"+"   "+no);
		do {
			cno[digits++]= dchar.charAt(no%cd);
			System.out.println(" +=====");
			if(no/cd != 0) {
				System.out.println(cd+"|   "+no+"  ..."+no%cd);
			}else {
				System.out.println("     "+no+"  ..."+no%cd);
			}
			no /= cd;
			
		}while(no!=0);
		for(int i =0; i<digits/2; i++) {
			char t;
			t = cno[i];
			cno[i] = cno[digits -i-1];
			cno[digits -i-1] =t;
		}
		return digits;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		System.out.println("변환하는 음이 아닌정수");
		no = sc.nextInt();
		System.out.println("진수 선택(2~36)");
		cd = sc.nextInt();
		dno=cardConvr(no, cd, cno);
		System.out.println("==결과==");
		for(int i = 0; i<dno; i++) {
			System.out.print(cno[i]+" ");
		}
		
	}

}
