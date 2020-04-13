package Test2;
// public 접근에 제한이 없음을 표시, 
//default 정의하지않으면 기본 default상태로 정의
//privat 자신의 클래스 내에서만 사용가능
//protected : 동일한 페키지 내에 존재하거나 파생된 클래스에서만 접근 가능
public class Appc {
	public int a;
	private int b;
	protected int c;
	int d;
	
	public void a1() {
		System.out.println("public 메소드 a1입니다.");
	}
	private void b1() {
		System.out.println("private 메소드 b1입니다.");
	}
	protected void c1() {
		System.out.println("protected 메소드 c1입니다.");
	}
	void d1() {
		System.out.println("기본 메소드 d1입니다.");
	}
}
