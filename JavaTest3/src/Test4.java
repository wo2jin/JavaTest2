class Student3{
	public Student3() {
		System.out.println("Deafult Constructor");
		name = "홍길동";
		age = 20;
	}
	public Student3(String nm, int ag) { //메소드뿐만 아니라 생성자 자체도 오버로딩이 가능하다. 이렇게 되면 디폴트생성자가 무시되고 호출된다.
		name =nm;
		age = ag;
	}
	//Overloading(오버로딩) : 클래스 안에 사용되는 메소드 안에서 이름을 동일하게 파라미터 개수,타입이 틀린 경우
	//Overriding(오버라이딩) : 
	private String name;
	private int age;
	public void setName(String nm) {
		name = nm;
	}
	public void setAge(int ag) {
		age = ag;
	}
	public void gotoSchool() {
		System.out.println(name+","+age+" 가 학교에 간다.");
	}
	
	public String getName() {
		return name;
	}
	public void setName(String nm, int ag) {
		
	}
}
public class Test4 {
	public static void main(String[] args) {
		
		Student3 stu = new Student3();
		stu.gotoSchool();
		
		Student3 stu2 = new Student3("이순신",30);
		stu2.gotoSchool();
		
	}

}
