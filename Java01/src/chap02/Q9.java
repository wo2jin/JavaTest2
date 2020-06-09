package chap02;

public class Q9 {
	static int sumof(int a, int b) {
		int i =a;
		int answer = 0;
		while(i<=b) {
			answer +=i;
			i++;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sumof(3,5));
	}

}
