package ws2.java2.entity;

public class Ship extends Vehicle{
	private int replacement;		// Ship������ ����ϴ� ����
	public Ship(String modelName, int maxSpeed, int numberLimit, boolean available, int replacement) {
		super(modelName, maxSpeed, numberLimit, available);
		this.replacement = replacement;
	}

	public void displayInfo() {
		super.displayInfo();
		System.out.println(" �� �� �� : " + getReplacement() + "��");	// Ship������ ����ϴ� ����
	}

	public int getReplacement() {
		return replacement;
	}

	public void setReplacement(int replacement) {
		this.replacement = replacement;
	}

}
