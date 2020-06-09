package chap01;

public class Q3 {
	static int sumOf(int[] a){
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum += a[i];
		}
		return sum; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		System.out.println(sumOf(a));
	}

}
