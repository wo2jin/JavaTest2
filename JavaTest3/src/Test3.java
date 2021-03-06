class Student2{
	private String name;//위치 상관없고 메소드 안에서 사용되기 위해서는 미리 생성되어 있어야함+private는 값이 수정되는것을 방지하기위해서
	//굳이 이렇게 메소드를 만드는 이유 : 수정할때 일일이 수정하지 않고 하나만 하기위해
	public void setName(String nm) {
		name = nm;
	}
	public String getName() {
		return name;
	}
	public void gotohSchool() {
		System.out.println(name+"이 학교에 간다.");
	}
	public Student2() {//기본적으로 생성되는 생성자 하지만 불러내서 쓰면 기본적으로 수행됨
		System.out.println("Default Constructor");
		name = "강감찬";
	}
}
public class Test3 {
	void s() {};
	public static void main(String[] args) {
		Student2 stu = new Student2();
		stu.setName("이순신");
		stu.gotohSchool();
		Student2 stu2;
		stu2 = new Student2();
		stu2.setName("강감찬");
		stu2.gotohSchool();
		Student2 t = execute(stu2);
		t.gotohSchool();
		
		
		Student2 t2 = execute(new Student2());
		t2.setName("김우진"); 
		Student2 t3 = new Student2();
		Student2 t4 = execute(t3);
		
		
	}
	static Student2 execute(Student2 s) {
		s.gotohSchool();
		return s;
	}

}
