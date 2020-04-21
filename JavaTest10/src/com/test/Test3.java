package com.test;

import java.util.*;

class Student2 implements Comparable{
	int age;
	public Student2(int age) {
		this.age = age;
	}
	@Override
	public int compareTo(Object o) {
		Student2 stu = (Student2)o;
		if(this.age > stu.age) {
			return 1;
		}else if(this.age < stu.age) {
			return -1;
		}else {
			return 0;
		}
	}
}
public class Test3 {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4};//[] array��ü�� ��������� �ȿ��� �ΰ����� �ȿ��� �ΰ����� ����
		Student2[] stuArr = new Student2[3];
		stuArr[0] = new Student2(1);
		stuArr[1] = new Student2(3);
		stuArr[2] = new Student2(2);
		
		System.out.println(arr);
		
		for(int inx =0; inx < stuArr.length; inx++) {
//			stuArr[inx]; //��ȯ�Ǵ� Ÿ���� studnet2
			Student2 s = stuArr[inx]; //student2Ÿ������ �޾Ƽ� s�� ����
			System.out.println(s.age);
		}
		System.out.println();
		for(Student2 s : stuArr) { //s�� ��ü stuArr��ü�� �ѹ��� ����
			System.out.println(s.age);
		}
		System.out.println();
		Arrays.sort(stuArr);
		System.out.println();
		for(Student2 s : stuArr) { //s�� ��ü stuArr��ü�� �ѹ��� ����
			System.out.println(s.age);
		}
		
		List<Student2> stu2 = new ArrayList<>();
		stu2.add(new Student2(1));
		stu2.add(new Student2(3));
		stu2.add(new Student2(2));
		
		for(int jnx = 0; jnx < stu2.size(); jnx++) {
			System.out.println(stu2.get(jnx).age);
		}
		
		for(Student2 s : stu2) {
			System.out.println(s.age);
		}
		
		Iterator<Student2> ltr = stu2.iterator();//Iterator�� ���¸� ������ �ȿ� �ִ� �޼ҵ带 ���
		while(ltr.hasNext()) {
			System.out.println(ltr.next().age);
		}
		Collections.sort(stu2);
		
		for(Student2 s : stu2) {
			System.out.println(s.age);
		}
		
	}
	

}
