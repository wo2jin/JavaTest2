
class A{ 
	int data =50; //instance variable
	static int m = 100; // static variable
	void method() {
		int n = 90; //local variable
	}
}

class Student{
	String name;
	int age;
	public void goSchoo() {
		System.out.println(name +"("+ age+")"+ "이 학교에 가다.");
	}
}
public class Test1 {
	
	public static void main(String[] args) {
		
		
		Student stu =new Student()	;
		stu.age = 27;
		stu.name = "김우진";
		stu.goSchoo();
		
		
		System.out.println(A.m);
		A.m = 200;
		System.out.println(A.m);
		A a = new A();
		String str ="1234";
		int a2 =Integer.parseInt(str);
		Integer a3 =new Integer(a2);
		String str2 = a3.toString();
	}

}
