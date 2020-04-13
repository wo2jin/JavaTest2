import com.acompany.*;
//import com.bcompany.*;

public class Test5 {
	public static void main(String[] args) {
//		com.acompany.Employee emp = new com.acompany.Employee();//이름이 겹치는것을 방지하기위해 페키지 별로 따라 분류해서 관리함/같은 이름의 비슷한 실행임에도 겹치지않음
//		com.bcompany.Employee emp2 = new com.bcompany.Employee();
		Employee emp3 = new Employee(); //import로 apth를 설정해줘도 서로 다른페기지에 이름이 같은 경우 오류가 생긴다. 이럴경우 생성자앞에 path를 설정
	}

}
