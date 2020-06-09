package chap01;

import java.util.Scanner;

public class Q11 {
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	static int[][] mdays = { { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }, // 평년
			{ 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } // 윤년
	};		
	
	int y;
	int m;
	int d;
	Q11(int y, int m, int d) {
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	Q11 after(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0) {
			return (before(-n));
		}
		temp.d += n;

		while (temp.d > mdays[isLeap(temp.y)][temp.m - 1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m - 1];
			temp.m += 1;
			if (temp.m > 12) { //날자가 많아져서 1년을 넘으면 년을 추가해줌 + if문을 통과하지 않더라도 ++tmep.m로 달이 늘어감 =>while문이 돌아가면 temp는 늘어남
				
				temp.y++;
				temp.m = 1;
			}
			
		}
		return temp;
	}
	Q11 before(int n) {
		Q11 temp = new Q11(this.y, this.m, this.d);
		if (n < 0)
			return (after(-n));

		temp.d -= n;

		while (temp.d < 1) {
			
			if (--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m - 1];
		}
		return temp;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("년도"); int y = sc.nextInt();
		System.out.print("달"); int m = sc.nextInt();
		System.out.print("월"); int d = sc.nextInt();
		Q11 ymd = new Q11(y,m,d);
		System.out.print("몇 일 앞/뒤의 날짜를 구할까요?：");
		int n = sc.nextInt();
		Q11 d1 = ymd.after(n);
	}

}
