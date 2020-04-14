package com.test;

class Account2{
	static double interest;
	private String AccountNo;
	private String AccountName;
	private int Balance;
	public Account2(String AccountNo,String AccountName, int Balance) {
		this.Balance=Balance;
		this.AccountName=AccountName;
		this.AccountNo=AccountNo;
	}
	public void deposit(int n) {
		Balance+=n;
	}
	public void withdraw(int n) {
		Balance-=n;
	}
	public String getAccountNo() {
		return AccountNo;
	}
	public String getAccountName() {
		return AccountName;
	}
	public int getBalance() {
		return Balance;
	}
	public void addInterest() {
		Balance=Balance+(int)(Balance*interest);
	}
}
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account2 customer1=new Account2("111-222-33333333","최은희",20000);
		Account2 customer2=new Account2("555-666-77777777","남매월",100000);
		System.out.println("기본 적립금");
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("한번의 입출금");
		customer1.deposit(1000000);
		customer2.withdraw(30000);
		printAccount(customer1);
		printAccount(customer2);
		System.out.println("이자율의 계산");
		Account.interest=0.05;
		customer1.addInterest(); //저축된 금액=원금+원금*이자율
		customer2.addInterest();//저축된 금액=원금+원금*이자율
		printAccount(customer1);
		printAccount(customer2);
	}
	static void printAccount(Account2 customer){
		System.out.println("계좌번호:"+customer.getAccountNo());
		System.out.println("예금주이름:"+customer.getAccountName());
		System.out.println("잔액:"+customer.getBalance());
		System.out.println();
		}
}
