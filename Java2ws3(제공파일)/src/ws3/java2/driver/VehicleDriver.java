package ws3.java2.driver;

import ws3.java2.controller.*;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
		vm.displayVehicles(">> ��� ��� <<");
//		vm.sortByModelName();
		vm.displayVehicles(">> �𵨸����� ���ĵ� ��� ��� <<");
		vm.sortByModelName("===sort===");
		vm.displayVehicles("===ilterator===");
	}
}
