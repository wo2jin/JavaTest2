
public class Test10 {
	static int add(int a, int b) {
		return(a+b); 
	}
	static int add(int  a) {
		return a; 
	}
	static String add(String a) {
		return a; 
	}
	static String add(String a, String b) {
		return (a+b); 
	}
	public static void main(String[] args) {
		System.out.println(add(1));
		System.out.println(add(1,2));
		System.out.println(add("tesxt"));
		System.out.println(add("text","text2"));
		
	}

}
