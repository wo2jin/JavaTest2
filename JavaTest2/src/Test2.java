class Employee{
	String name;
	int age;
	void gotWork() {
		System.out.println(name +","+age+"인 사람이 일을한다.");
	}
}
public class Test2 {
	public static void main(String[] args) {
		//value-type(값타임)vsreference-type(참조타입)
		//jvm
		//stack,heap
		
		int a =1;
		int b = a;
		
		Employee emp = new Employee();
		emp.name = "김우진";
		emp.age = 27;
		emp.gotWork();
		Employee  emp2 = emp;
		Employee emp3 = new Employee();
		emp2.gotWork();
		emp3.name ="아에이";
		emp3.age = 17;
		emp3.gotWork();
	}
}
