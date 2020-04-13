
public class Test4 {
	public static void main(String[] args) {
		int number =20;
		switch(number) {
		case 10:
			System.out.println("10");
			break;
		case 20:
			System.out.println("20");
			break;
		default:
			System.out.println("another");
		}
		
		if(number==10) {
			System.out.println("10");
		}else if(number ==20){
			System.out.println("20");
		}else {
			System.out.println("another");
		}
	}

}
