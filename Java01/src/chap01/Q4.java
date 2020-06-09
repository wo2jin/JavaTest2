package chap01;

public class Q4 {
	static int mid(int a, int b, int c) {
		int answer=0;
		
		if(a>=b) {
			if(a<=c) {
				answer = a;
			}else if(b>=c) {
			answer =b;
			}else {
				answer = c;
			}
		}else if(a>c) {
			answer =a;
		}else if(c>b) {
			answer = b; 
		}else {
			answer =c;
		}
		return answer;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("mid1:"+mid(5,2,3));
		System.out.println("mid2:"+mid(2,6,3));
		System.out.println("mid3:"+mid(5,2,3));
		System.out.println("mid4:"+mid(7,9,5));
		System.out.println("mid4:"+mid(4,4,4));
		
	}

}
