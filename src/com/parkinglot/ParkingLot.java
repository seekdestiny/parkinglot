package com.parkinglot;

import java.util.*;

public class ParkingLot {
	private Level[] levels;
	
	/**given a vehichle, tell me whether I can park it?**/
	public boolean hasSpot(Vehicle v) {
	//Todo: check each level, for each level, call Level#hasSpot(Vehicle)
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
	//boolean fit(Vehicle): check size and availability
	
}

enum VehicleSize {
	Compact(1), Large(3), Regular(2);
	
	private final int size;
	VehicleSize(int s) {
		size = s;
	}
}



