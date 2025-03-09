package com.company.behavioural.observer.test;

import com.company.behavioural.observer.model.TrafficSignal;
import com.company.behavioural.observer.model.VehicleBike;
import com.company.behavioural.observer.model.VehicleBus;
import com.company.behavioural.observer.model.VehicleCar;

public class TrafficSignalTest {

	public static void main(String[] args) {
		VehicleCar car = new VehicleCar();
		VehicleBike bike = new VehicleBike();
		VehicleBus bus = new VehicleBus();
		
		TrafficSignal signal = new TrafficSignal();
		
		signal.addVehicle(car);
		signal.addVehicle(bike);
		signal.addVehicle(bus);
		
		signal.changeLight("Red");
		signal.changeLight("Green");
	}

}
