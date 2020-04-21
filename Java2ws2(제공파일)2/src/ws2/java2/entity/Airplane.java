package ws2.java2.entity;

public class Airplane extends Vehicle{
	private int numOfEngine;   // Airplane������ ����ϴ� ����

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

	public void displayInfo() {   // Airplane������ ����ϴ� �޼ҵ�
		super.displayInfo();  // ����Ŭ���� vehicle�� �޼��带 ������
		System.out.println(" �������� : " + getNumOfEngine() + "��");
	}
}
