package com.test1;
@FunctionalInterface
interface Calc2<T>{
	T cal(T a, T b);
}
public class LambdaGeneric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calc2<Integer> c1 = (a,b)-> a+b; 
		System.out.println(c1.cal(1,2));
		
		Calc2<Double> c2 = (a,b) -> {return a+b;};
		System.out.println(c2.cal(1.1, 2.2));
	}

}
