package chap01;
class Id{
	private static int counter = 0; //아이디를 몇개 부여했는지 저장
	private int id; //아이디
	
	//생성장
	public Id(){ id = ++counter;}
	//id를 반환하는 인스턴스 메서드
	public int getId(){ return id; }
	//counter를 반환하는 클래스 멘서드
	public static int getCounter() {return counter;}
}
public class p3C_1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Id a = new Id(); //아이디1
		Id b = new Id(); //아이디2
		
		System.out.println("a의 아이디 :" + a.getId());
		System.out.println("b의 아이디 :" + b.getId());
		
		System.out.println("부여한 아이디의 갯수 :"+Id.getCounter());
	}

}
