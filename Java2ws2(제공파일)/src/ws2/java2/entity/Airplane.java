package ws2.java2.entity;

import ws2.java2.entity.Vehicle;

public class Airplane extends Vehicle{
	
	private int numOfEngine;
	private boolean available;
	
	Vehicle vh = new Vehicle();
	
	public Airplane(String modelName, int maxSpeed, int numberLimit,int numOfEngine) {
		super(modelName,maxSpeed,numberLimit);
		this.numOfEngine = numOfEngine;
	}
	
	

//	public String getModelName() {
//		return modelName;
//	}
//
//	public void setModelName(String modelName) {
//		this.modelName = modelName;
//	}
//
//	public int getMaxSpeed() {
//		return maxSpeed;
//	}
//
//	public void setMaxSpeed(int maxSpeed) {
//		this.maxSpeed = maxSpeed;
//	}
//
//	public int getNumberLimit() {
//		return numberLimit;
//	}
//
//	public void setNumberLimit(int numberLimit) {
//		this.numberLimit = numberLimit;
//	}

	public int getNumOfEngine() {
		return numOfEngine;
	}

	public void setNumOfEngine(int numOfEngine) {
		this.numOfEngine = numOfEngine;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" 모 델 명 : " + getModelName());
		System.out.println(" 최고속도 : " + getMaxSpeed + "km/h");
		System.out.println(" 최대정원 : " + getNumberLimit + "명");
	}
}
