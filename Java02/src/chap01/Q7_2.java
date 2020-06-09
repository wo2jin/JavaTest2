package chap01;
import java.util.Scanner;
public class Q7_2 {
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(r + "|    " + x);
		do {
			System.out.println("+------");
			d[digits++]= dchar.charAt(x%r);
			if (x / r != 0)
				System.out.println(r + "|    " + x/r + " ....." + x%r);
			else
				System.out.println("      " + x/r+ " ....." + x%r);
			x/=r;
		}while(x!=0);
		for(int i = 0; i < digits/2 ; i++) {
			char temp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = temp;
		}	
		return digits;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int no;
		int cd;
		int dno; //변환후의 자리수
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수 : ");
				no = scan.nextInt();
			}while(no < 0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = scan.nextInt();
			}while(cd<2||cd>36);
			
			dno = cardConv(no,cd,cno);
			
			System.out.println(cd + "진수로는 ");
			for(int i = 0; i<dno; i++)
				System.out.print(cno[i]);
			System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1.예 / 0. 아니오) : ");
			retry = scan.nextInt();
		}while (retry == 1 );
	}
}