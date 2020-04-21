package ws2.java2.entity;

// 상위클래스
public class Vehicle implements Comparable{
	private String modelName;   // AIrplane, Ship, Car에서 사용하는 공통 변수 
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit, boolean available  ) {  // 생성자
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
		this.available = available;	
	}
	
	@Override
	public int compareTo(Object v) {
		Vehicle  s = (Vehicle)v;
		if(this.modelName.length() > s.modelName.length())
			return 1;
		else if(this.modelName.length() < s.modelName.length())
			return -1;
		else
			return 0;
	}
	
	
	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getNumberLimit() {
		return numberLimit;
	}

	public void setNumberLimit(int numberLimit) {
		this.numberLimit = numberLimit;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public static void main(String[] args) {
		
	}
	
	public void displayInfo()  {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed() + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit() + "명");
	}
	
}
