
public class Test8 {
	
	public static void main(String[] args) {
		Animal a= new Animal();
		Dog d = new Dog();
		
		Animal a1 = d; //Dog는 Animall의 상속 클래스여서 animal의 요소만 가지고 animal타입으로 변환가능하다 Dog -> Animal 암시형 캐스팅 Animal ->Dog 명시형 캐스팅
		a1.breath();
		Dog d1 = (Dog)a1;
		d1.Bark();
		
		Cat c = new Cat();
		Animal a2 = c;
		
		Dog d2 = (Dog)a;
		
		
	}
	static void Test(Dog d) {}
	static void Test2(Cat d) {}

}
