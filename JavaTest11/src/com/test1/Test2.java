package com.test1;
enum Menu{
	Pizza, Nuddle
}
enum Menu2{
	Pizza(100),Nuddle(200);
	int aa;
	private Menu2(int aa) { //Pizza�� ������ int aa�� 100�� �����鼭 ���ڰ��ȿ� 100�� ���Ե�
		this.aa = aa;
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Menu m = Menu.Pizza;
		System.out.println(m);
		System.out.println(Menu.valueOf("Pizza"));
		System.out.println(Menu.valueOf("Pizza").ordinal());
		
		System.out.println(Menu2.valueOf("Pizza"));
		System.out.println(Menu2.valueOf("Pizza").aa);
	}

}
