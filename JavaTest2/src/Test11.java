//ReculFactorial
public class Test11 {
	public static int factorial(int n) {
		if(n==1) {
			return 1;
		}else{
			return n*factorial(n-1);
		}
	}
	public static void main(String[] args) {
		System.out.println("3 factorial : "+factorial(3));
		System.out.println("12 factorial : "+factorial(12));
		
	}

}
