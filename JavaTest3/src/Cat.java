
class Duck{
	public Duck() {
		System.out.println("quak");
	}
}
public class Cat extends Animal {
	public void Meow() {
		System.out.println("cat Meow");
	}
	public void makeCat() {
		Duck quack = new Duck();
	}
	public void breath() {
		System.out.println("cat breath");
	}
}
