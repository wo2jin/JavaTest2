package ws2.java2.entity;



public class Vehicle implements Comparable {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	public Vehicle() {
		
	}
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
	}
	
	@Override
	public int compareTo(Object o) {
		Vehicle s = (Vehicle)o;
		if(this.maxSpeed == s.maxSpeed) {
			return 0;
		}else if(this.maxSpeed > s.maxSpeed) {
			return -1;
		}else {
			return 1;
		}
	}
	
	public void displayInfo() {
		
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

}
