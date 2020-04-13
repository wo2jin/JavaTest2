
public abstract class Test10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.breath();
		d.Bark();
		
		Cat c= new Cat();
		c.breath();
		c.Meow();
		
		Animal a =d; //Dog object, Animal type
		d.breath();
		Dog d2 = (Dog)a;
		d2.Bark();
		d2.breath();
		
		Animal a1 = c;
		a1.breath();//Cat object, Animal type
		
		Animal a3 = new Dog();
		a3.breath();
		Dog d3 = (Dog)a3;
		d3.Bark();
		d3.breath();
		
		Animal a4 = new Cat();
		a4.breath();
		Cat c3 = (Cat)a4;
		c3.breath();
		c3.Meow();
		
//		Animal a10 = new Animal(); //animal obejct, dog type으로 컨버팅이 불가능하다
//		Dog d10 =(Dog)a10;
		
//		Dog d11 = new Dog(); // Dog객체로 생성해서 animal타입으로 변환 후에 다시한번 cat타입으로 변화해도 객체가 Dog이기 때문에 불가능
//		Animal a11 =d11;
//		Cat c11 =(Cat)a11;
		
		
		Object o = new Dog();
		Dog d12 = (Dog)o;
		d12.Bark();
		d12.breath();
		
		
	}

}
