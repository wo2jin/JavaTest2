package ws3.java2.entity;

public abstract class Vehicle implements Comparable {
	private String modelName;
	private int maxSpeed;
	private int numberLimit;
	private boolean available;
	
	
	public Vehicle() {
	}
	
	@Override
	public int compareTo(Object o) {
		Vehicle  s = (Vehicle)o;
		if(this.modelName.length() > s.modelName.length())
			return 1;
		else if(this.modelName.length() < s.modelName.length())
			return -1;
		else
			return 0;
		
	}
	
	public Vehicle(String modelName, int maxSpeed, int numberLimit) {
		this.modelName = modelName;
		this.maxSpeed = maxSpeed;
		this.numberLimit = numberLimit;
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
	
	public void displayInfo() {
		System.out.println("-------------------------------------------");
		System.out.println(" �� �� �� : " + modelName);
		System.out.println(" �ְ�ӵ� : " + maxSpeed + "km/h");
		System.out.println(" �ִ����� : " + numberLimit + "��");
	}

	
}
