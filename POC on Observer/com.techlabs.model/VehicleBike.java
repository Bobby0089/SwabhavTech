package com.company.behavioural.observer.model;

public class VehicleBike implements ObserverVehicle {

	private String light;
	
	@Override
	public void update(String lightColour) {
		this.light = lightColour;
		System.out.println("Bike : Traffic light updated to : " + light);
	}

}

