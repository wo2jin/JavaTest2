package chap01;
import java.util.Scanner;
public class Exercise2Q6 {
	static int cardConv(int x, int r, char[] d) {
		//정수 x를 r진수로 변환하고, 그 값의 각 자리의 문자를 char형 배열인 d에(아랫자리부터) 넣는다. 
		//그리고 그 자릿수(배열에 넣어둔 문자 수)를 반환하는 메서드.
		int digits=0; //변환후의 자릿수
		String dchar ="0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		System.out.println(r+"|       "+x);
		System.out.println("  + ---------");
		do { //charAt은 ()안에 있는 문자를 가져오기 위한 메서드.
			d[digits++] = dchar.charAt(x%r); 
			// x를 r로 나눈 나머지 값을 dchar에서 찾아 d[자릿수++]배열에 대입한다. 
			//do-while문이 돌 동안 자릿수값 증가.
			if(x/r !=0) {
				System.out.println(r+"|       "+x/r+"..."+dchar.charAt(x%r));
				System.out.println("  + ---------");
			}
			else {
				System.out.println(r+"|       "+x/r+"..."+dchar.charAt(x%r));
			}
			x /=r;  // x = x/r x를 r로 나눈다.
		}while (x !=0); //x가 0이 될때 까지 계속 돈다.
//		for(int i =0; i<digits/2; i++) { //역순으로 나온 배열을 다시 역순으로 저장
//			char tmp = d[i];
//			d[i] = d[digits -i -1];
//			d[digits -i -1] = tmp;
//		}//또는 다른 방법
//	다른방법 찾아보기 	
		for(int i=(d.length-1)/2; i<=0; i-- ) {
			char tmp = d[i];
			d[i] = d[digits-i-1];
			d[digits-i-1] = tmp;
			System.out.println(digits);
		}
		return digits; //자릿수를 반환한다.
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no; //변환하는 정수
		int cd; //기수
		int dno; //변환 후의 자릿수
		int retry; //다시한번 더
		char[] cno = new char[32]; //뱐환 후 각 자리의 숫자를 넣어두는 문자의 배열
		System.out.println("10진수를 기수로 변환합니다.");
		do{
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = sc.nextInt();
			}while (no<0); //정수가 0보다 클때까지 반복
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36):");
				cd=sc.nextInt();
			}while (cd <2 || cd>36);
			dno = cardConv(no, cd, cno);
			//no를 cd진수로 변환 > char[] con에 아래자리 수부터 역순으로 저장 
			System.out.print(cd+ "진수로는"); 
			for(int i=0; i<dno; i++)
				//역순 저장된것을 다시한번 역순으로 저장, 윗자리부터 순차대로 저장.
				System.out.print(cno[i]);
			System.out.println("입니다.");
			System.out.print("한번 더 할까요? (1.예 / 0.아니오) :"); 
			retry = sc.nextInt();
		}while (retry ==1);
	}
}