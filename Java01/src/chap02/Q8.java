package chap02;

public class Q8 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 38;
		int sum = 0;
		int sum2 = 0;
		sum = (n*(n+1))/2;
		System.out.println(sum);
		
		for(int i=1;i<=n;i++) {
			sum2 += i;
		}
		System.out.println("==="+sum2);
	}

}
