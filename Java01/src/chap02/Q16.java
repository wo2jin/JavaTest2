package chap02;

public class Q16 {
	static void spira(int n) {
		for(int i =1; i<=5;i++) {
			for(int j=1; j<=(n-i)+1;j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=(i-1)*2+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q16 a = new Q16();
		a.spira(5);
		
	}

}
