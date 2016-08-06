package com.parkinglot;

public enum VehicleSize {
	Compact(1), Large(3), Regular(2);
	
	private final int size;
	VehicleSize(int s) {
		size = s;
	}
}
