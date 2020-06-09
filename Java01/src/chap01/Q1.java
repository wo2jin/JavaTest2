package chap01;

public class Q1 {
	
	static int max(int a, int b, int c,int d) {
		int max =a;
		if(b>max) { max = b;}
		if(c>max) { max = c;}
		if(d>max) { max = d;}
		
			
		return max;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("1:"+max(1,2,3,1));
		System.out.println("2:"+max(1,5,3,1));
		System.out.println("3:"+max(1,2,3,6));
		
	}

}
