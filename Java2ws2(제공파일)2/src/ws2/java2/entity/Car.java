package ws2.java2.entity;

public class Car extends Vehicle{
	private int mileage;		// Car������ ����ϴ� ����
	public Car(String modelName, int maxSpeed, int numberLimit, boolean available, int mileage) {
		super(modelName, maxSpeed, numberLimit, available);
		this.mileage = mileage;
	}

	public void displayInfo() {	
		super.displayInfo();
		System.out.println(" ��տ��� : " + getMileage() + "km/l");   // Car������ ����ϴ� ����
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
}
