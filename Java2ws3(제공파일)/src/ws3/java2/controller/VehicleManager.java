package ws3.java2.controller;

import java.util.*;


import ws3.java2.entity.*;

public class VehicleManager {
	//�Ʒ� �ڵ�� �迭�� �����ϴ� ������ ������ ���̴�.
	//ArrayList�� �����ϵ��� ���ο� ������ �����Ͻÿ�.(��������  vehicleList)

	List<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	public VehicleManager() {
		//�Ʒ� �ڵ�� �迭�� �̿��ϵ��� �ۼ��Ǿ���.
		//ArrayList�� ����ϵ��� �����Ͻÿ�.
	
		
		vehicleList.add(new Airplane("����747", 1300, 300, 4));
		vehicleList.add(new Airplane("F-16", 1600, 1, 1));
		vehicleList.add(new Car("�ҳ�Ÿ3", 180, 5, 10));
		vehicleList.add(new Car("Ƽ��", 130, 4, 15));
		vehicleList.add(new Car("��Ÿ����", 150, 10, 11));
		vehicleList.add(new Ship("ũ����2", 30, 400, 35000));
		vehicleList.add(new Ship("��ƿ����", 25, 150, 15000));
		
		
		
	}
	
	public void displayVehicles(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		System.out.println(title);
		
		for(Vehicle s : vehicleList) {
			s.displayInfo();
		}
	}
	
	public void sortByModelName(String title) {
		System.out.println(title);
		Collections.sort(vehicleList);
		
		for(Vehicle s : vehicleList) {
			s.displayInfo();
		}
	}
	public void displayVehicles2(String title) {
		//�Ʒ� �ڵ�� �迭�� ����Ű�� ��� ��ü�� ������ ����ϵ��� �ۼ��Ǿ���.
		//ArrayList�� vehicleList�� ��� ��� ��ü�� ����ϵ��� �����Ͻÿ�.
		System.out.println(title);
		Iterator<Vehicle> li = vehicleList.iterator();
		while(li.hasNext()){
			Vehicle v = li.next();
			v.displayInfo();
			v.setAvailable(true);//���� ������ Ȯ�ο� �Ƚᵵ ����
		}
	}
}

