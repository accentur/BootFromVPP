package com.virtualpairprogrammers.rest;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.virtualpairprogrammers.domains.Vehicle;

@XmlRootElement(name = "vehicles")
public class VehicleList {

	public VehicleList() {
	}

	public VehicleList(List<Vehicle> vehicles) {
		super();
		this.vehicles = vehicles;
	}

	private List<Vehicle> vehicles;

	@XmlElement(name = "vehicle")
	public List<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(List<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

}
