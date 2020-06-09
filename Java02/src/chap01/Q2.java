package chap01;

public class Q2 {
	static void reverse(int[] a) {
		int n = a.length-1;

		for(int i=0; i< a.length/2; i++ ) {
			int t = a[i];
			a[i] = a[n-i];
			a[n-i] =t;
			System.out.println("b["+i+"]와 b["+(n-i)+"]를 바꿉니다.");
			for(int j=0;j<a.length;j++){
				System.out.print(a[j]+" ");
			}
			System.out.println();
		}
		System.out.println("연순 정렬 끝");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] b= {5,10,73,2,-5,42};
		reverse(b);
		
	}

}
