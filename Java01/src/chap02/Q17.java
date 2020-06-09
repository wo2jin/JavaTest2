package chap02;

public class Q17 {
	static void npira(int n) {
		for(int i =1; i<=n;i++) {
			for(int j=1; j<=(n-i)+1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1;j++) {
				System.out.print(i%10);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q17 a = new Q17();
		a.npira(5);
		npira(18);
		
	}
}
