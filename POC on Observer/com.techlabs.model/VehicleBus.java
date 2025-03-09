package com.company.behavioural.observer.model;

public class VehicleBus implements ObserverVehicle {

	private String light;
	
	@Override
	public void update(String lightColour) {
		this.light = lightColour;
		System.out.println("Bus : Traffic light updated to : " + light);
	}

}
