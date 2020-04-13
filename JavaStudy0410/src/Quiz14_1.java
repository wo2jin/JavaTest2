class Car{
	int gasolineGauge;
}

class HybridCar extends Car{
	int electoricGuage;
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	public void showCurrentGauge() {
		System.out.println("잔여 가솔린:"+gasolineGauge);
		System.out.println("잔여 전기량:"+electoricGuage);
		System.out.println("잔여 워터량:"+waterGauge);
		
	}
}

public class Quiz14_1 {

	public static void main(String[] args) {



	}

}
