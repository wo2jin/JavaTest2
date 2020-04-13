
public class Test3 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c= (a>b?a:b);
		System.out.println(c);
		a=3;
		b=1;
		
		if(a>b) {
			c=a;
			System.out.println(c);
		}else{
			c=b;
			System.out.println(c);
		}
		
	}

}
