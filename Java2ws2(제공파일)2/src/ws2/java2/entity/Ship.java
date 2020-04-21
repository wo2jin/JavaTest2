package ws2.java2.entity;

public class Ship extends Vehicle{
	private int replacement;		// Ship에서만 사용하는 변수
	public Ship(String modelName, int maxSpeed, int numberLimit, boolean available, int replacement) {
		super(modelName, maxSpeed, numberLimit, available);
		this.replacement = replacement;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" 배 수 량 : " + getReplacement() + "톤");	// Ship에서만 사용하는 변수
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

}
