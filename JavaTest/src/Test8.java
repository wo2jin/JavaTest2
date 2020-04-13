import java.util.Scanner;
public class Test8 {
	public static void main(String[] args){
//		boolean choice = true;
//		if(choice == true) {
//			System.out.println("ok");
//		}else {
//			System.out.println("cancel");
//		}
//		
//		int x =100;
//		if(x<20) {
//			System.out.println("x<20");
//		}else {
//			System.out.println("x>20");
//		}
//		
		Scanner scan = new Scanner(System.in);
		System.out.print("name:");
		String name = scan.next();
		String beast = "문일주";
		if(name.equals(beast)) { //문자형은 ==와 같은 비교연사자로 비교 불가
			System.out.println("짐승입니다.");
		}else {
			System.out.println("사람입니다");
		}
		scan.close();
	}
}
