package com.test3;

class Test{
	private String[] answer = new String[] {"D","B","D","C","C","D","A","E","A","D"};
	int count =0;
	static int studentno;
	public Test() {
		
	}
	public Test(String[] stu) {
		int count =0;
		for(int i=0;i<10;i++) {
			if(stu[i] == answer[i]) {
				count++;
			}
		}System.out.println("Student["+studentno+"]'s Score is "+count);
	}
	
}

public class Workshop2 {
//	String[] answer = new String[] {"D","B","D","C","C","D","A","E","A","D"};
//	int count =0;
//	int studentno;
//	void Test(String[] stu) {
//		int count =0;
//		for(int i=1;i<=10;i++) {
//			if(stu[i] == answer[i]) {
//				count++;
//			}
//		}System.out.println("Student["+studentno+"]'s Score is "+count);
//	}
//	
	public static void main(String[] args) {
		String[] stu1= new String[]{"A","B","A","C","C","D","E","F","A","D"};
		String[] stu2= new String[]{"D","B","A","B","C","A","E","F","A","D"};
		String[] stu3= new String[]{"E","D","D","A","C","B","E","E","A","D"};
		String[] stu4= new String[]{"C","B","A","E","D","D","E","F","A","D"};
		String[] stu5= new String[]{"A","B","D","C","C","D","E","E","A","D"};
	
		Test t1 = new Test(stu1);
		Test t2 = new Test(stu2);
		Test t3 = new Test(stu3);
		Test t4 = new Test(stu4);
		Test t5 = new Test(stu5);
		
	}
	
}
