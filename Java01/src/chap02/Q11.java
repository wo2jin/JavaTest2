package chap02;

public class Q11 {
	static int postion(int a) {
		int count = 1;
		do {
			a /= 10;
			count +=1;
			System.out.println(a);
		}while(a>=10);
		
		return count;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print(postion(12345));
	}

}
