class BankAccount{
	String accNumber;//인스턴스 변수
	String ssNumber;
	int balance =0;
	
	//인스턴스 메소드
	public void initAccount(String acc, String ss, int bal) {
		accNumber = acc;
		ssNumber = ss;
		balance = bal;
	}
	
	public int deposit(int amount) {
		balance += amount;
		return balance;
	}
	
	public int withdraw(int amount) {
		balance -= amount;
		return balance;
	}
	
	public int checkMyBalance() {
		System.out.println("계좌번호 : " + accNumber);
		System.out.println("주민번호 : " + ssNumber);
		System.out.println("잔      액 : " + balance+"\n");
		return balance;
	}
}
public class BankAccountUniID {
	public static void main(String[] args) {
		BankAccount yoon = new BankAccount();//매개변수
		yoon.initAccount("33-55-09", "770088-5959007", 20000);//참조 변수
		
		BankAccount park = new BankAccount();
		park.initAccount("33-55-09", "770088-5959007", 20000);
		
//		yoon.
	}
	
	

}
