package com.parkinglot;

import java.util.List;
import java.util.ArrayList;

public class ParkingLot {
	private Level[] levels;
	
	public ParkingLot(int numOfLevels, int numOfSpots) {
		levels = new Level[numOfLevels];
		for (int i = 0; i < numOfLevels; i++) {
			levels[i] = new Level(numOfSpots);
		}
	}
	
	/**given a vehicle, tell me whether I can park it?**/
	public boolean hasSpot(Vehicle v) {
	//TODO: check each level, for each level, call Level#hasSpot(Vehicle)
		
		return true;
	}
	
	//TODO: park
	
	//TODO: leave
	
	public static void main(String[] args) {
		System.out.println("Hello World!");
	}
}

class Level {
	private final List<ParkingSpot> spots;
	//level number
	Level(int numOfSpots) {
		spots = new ArrayList<ParkingSpot>(numOfSpots);
		for (int i = 0; i < numOfSpots; i++) {
			spots.add(new ParkingSpot());
		}
	}
	
	boolean hasSpot(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				return true;
			}
		}
		return false;
	}
	
	boolean park(Vehicle v) {
		for (ParkingSpot s : spots) {
			if (s.fit(v)) {
				s.park(v);
				return true;
			}
		}
		return false;
	}
	
	//TODO: leave
}

class ParkingSpot {
	private VehicleSize size;
	private Vehicle currentVehicle;//null if no vehicle is parked inside
	
	//boolean fit(Vehicle): check size and availability
	public boolean fit(Vehicle v) {
		if (currentVehicle == null) {
			// check size
			return size.compareTo(v.getSize()) >= 0;
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



