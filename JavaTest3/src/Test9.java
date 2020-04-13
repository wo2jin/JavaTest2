
public class Test9 {
	
	public static void main(String[] args) {
		Dog d = new Dog();
		Animal a = d;
		Animal a1 = new Dog();
		a1.breath();
		Animal a2 = new Cat();
		a2.breath();
		
		Dog d1 = (Dog)a;
		
		Animal a11 = Test(new Dog());
		Dog d2 = (Dog)a11;
		d2.Bark();
		
		Test3(new Dog());
	}
	static Animal Test(Animal a) {//Dog타입과 Cat타입 모두 받을수 있다 만약 이런게 불가능할시 타입별로 모든 메소드를 만들어야한다.
		return new Dog();
	}
	static void Test3(Animal a) { //Animal a = new Dog();
	}
	
}
