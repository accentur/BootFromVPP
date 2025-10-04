package com.virtualpairprogrammers.domains;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vehicle {

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	private long id;
	private String name;
	private int odometer;
	private String status;
	private String latLong;
	private String currentDriver;
	private String chassisNumber;
	

	public Vehicle() {}
	
	public Vehicle(String name) {
		this.name = name;
	}

	public String toString()
	{
		return this.name + " odometer "  + this.odometer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOdometer() {
		return odometer;
	}

	public void setOdometer(int odometer) {
		this.odometer = odometer;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLatLong() {
		return latLong;
	}

	public void setLatLong(String latLong) {
		this.latLong = latLong;
	}

	public String getCurrentDriver() {
		return currentDriver;
	}

	public void setCurrentDriver(String currentDriver) {
		this.currentDriver = currentDriver;
	}
	
	public String getChassisNumber() {
		return chassisNumber;
	}
	
	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}
	
}
