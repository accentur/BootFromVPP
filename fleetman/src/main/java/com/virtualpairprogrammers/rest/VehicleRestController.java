package com.virtualpairprogrammers.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.virtualpairprogrammers.data.VehicleRepository;
import com.virtualpairprogrammers.domains.Vehicle;

@RestController
public class VehicleRestController {

	@Autowired
	private VehicleRepository repository;

	@RequestMapping("/vehicles")
	public VehicleList allVehicles() {

		List<Vehicle> listOfCars = repository.findAll();

		VehicleList v = new VehicleList(listOfCars);
		return v;

	}

}
