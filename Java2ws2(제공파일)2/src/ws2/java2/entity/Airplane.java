package ws2.java2.entity;

public class Airplane extends Vehicle{
	private int numOfEngine;   // Airplane에서만 사용하는 변수

	public Airplane(String modelName, int maxSpeed, int numberLimit, boolean available, int engine) {
		super(modelName, maxSpeed, numberLimit, available);
		this.numOfEngine = engine;
	}

	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	public void displayInfo() {   // Airplane에서만 사용하는 메소드
		super.displayInfo();  // 상위클래스 vehicle의 메서드를 가져옴
		System.out.println(" 엔진개수 : " + getNumOfEngine() + "개");
	}
}
