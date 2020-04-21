package ws2.java2.entity;

public class Car extends Vehicle{
	private int mileage;		// Car에서만 사용하는 변수
	public Car(String modelName, int maxSpeed, int numberLimit, boolean available, int mileage) {
		super(modelName, maxSpeed, numberLimit, available);
		this.mileage = mileage;
	}

	public void displayInfo() {	
		super.displayInfo();
		System.out.println(" 평균연비 : " + getMileage() + "km/l");   // Car에서만 사용하는 변수
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
