class Circle{
	private double rad =0; //
	final double PI = 3.14;//final class앞 : 상속받을수 없을 뜻함, method앞 : 오버라이딩(재정의)가 불가능함을 뜻함, 필드/상수 앞: 값을 변경할수 없음을 뜻함(초기에 값을 반드시 지정해줘야함)
	public Circle(double r) {
		setRad(r);
	}
	public void setRad(double r) {
		if(r < 0){
			rad= 0;
			return;
		}
		rad =r;
	}
	public double getRad() {
		return rad;
	}
	public double getArea() {
		return (rad*rad)*PI;
	}
}

public class InfoHideCircle {
	public static void main(String[] args){
		Circle c = new Circle(1.5);
		System.out.println("반지름 : "+ c.getRad());
		System.out.println("넓   이  : "+  c.getArea());
		
		c.setRad(3.4);
		System.out.println("반지름 : "+ c.getRad());
		System.out.println("넓   이 : "+ c.getArea());
		
	}
}


