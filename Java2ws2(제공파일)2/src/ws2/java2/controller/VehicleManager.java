package ws2.java2.controller;

import java.util.Arrays;

import ws2.java2.entity.*;

public class VehicleManager {
	Vehicle[] vehicleArr;
	public VehicleManager() {
		vehicleArr = new Vehicle[6];
		
		vehicleArr[0] = new Airplane("����7472", 1300, 300, true, 4);
		vehicleArr[1] = new Car("�ҳ�Ÿ32", 180, 45, true, 20);
		vehicleArr[2] = new Car("���", 200, 40, true, 11);
		vehicleArr[3] = new Car("�׷���33", 250, 80, true, 50);
		vehicleArr[4] = new Ship("Ÿ��Ÿ��2224", 500, 30, true, 400);
		vehicleArr[5] = new Ship("�Ǵн�444444", 800, 200, true, 500);
	
		
	}
	public void sortByModelName() {
		Arrays.sort(vehicleArr);
		for(Vehicle s : vehicleArr) {
			s.displayInfo();
		}
	}
	public void displayVehicles(String title) {
		System.out.println(title);
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
			
		System.out.println();

	}
}

