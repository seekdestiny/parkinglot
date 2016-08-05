package com.parkinglot;

public class ParkingLot {
	private Level[] levels;
	
	/**given a vehicle, tell me whether I can park it?**/
	public boolean hasSpot(Vehicle v) {
	//TODO: check each level, for each level, call Level#hasSpot(Vehicle)
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Level {
	//tracking Parking Spots
	//boolean hasSpot(Vehicle);
}

class ParkingSpot {
	private VehicleSize size;
	private Vehicle currentVehicle;//null if no vehicle is parked inside
	
	//boolean fit(Vehicle): check size and availability
	public boolean fit(Vehicle v) {
		if (currentVehicle == null) {
			// check size
			return size.ordinal() >= v.getSize().ordinal();//TODO not using ordinal
		}
		return false;
	}
	
	/**record a vehicle is parked in by updating the currentVehicle field*/
	public boolean park(Vehicle v) {// boolean park(Vehicle v)
		if (fit(v)) { // call fit first
			currentVehicle = v; 
			return true;
		}
		return false;
	}
	
	public void leave() {
		currentVehicle = null;
	}
}

enum VehicleSize {
	Compact(1), Large(3), Regular(2);
	
	private final int size;
	VehicleSize(int s) {
		size = s;
	}
}



