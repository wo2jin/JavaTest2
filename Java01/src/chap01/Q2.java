package chap01;

public class Q2 {
	static int min3(int a,int b, int c, int d) {
		int min =a;
		if(b<min) {min=b;}
		if(c<min) {min=c;}
		if(d<min) {min=d;}
		
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("min : "+min3(1,2,3,4));
		System.out.println("min : "+min3(5,2,4,6));
		System.out.println("min : "+min3(7,5,10,3));
	}

}
