package com.parkinglot;

public abstract class Vehicle {
	//data fields
	//getSize() method
	public abstract VehicleSize getSize();
}

//Car class
class Car extends Vehicle {
	public VehicleSize getSize() {
		return VehicleSize.Compact;
	}
}

//Truck class
class Truck extends Vehicle {
	public VehicleSize getSize() {
		return VehicleSize.Large;
	}
}