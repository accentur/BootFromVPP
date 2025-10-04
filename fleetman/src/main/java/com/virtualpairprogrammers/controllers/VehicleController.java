package com.virtualpairprogrammers.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.virtualpairprogrammers.data.VehicleRepository;
import com.virtualpairprogrammers.domains.Vehicle;

@Controller
@RequestMapping("/website/vehicles")
public class VehicleController 
{
	@Autowired
	private VehicleRepository data;

	@RequestMapping(value="/newVehicle.html",method=RequestMethod.POST)
	public String newVehicle(Vehicle vehicle)
	{
		data.save(vehicle);
		return "redirect:/website/vehicles/list.html";

	}
	
	@RequestMapping(value="/newVehicle.html",method=RequestMethod.GET)
	public ModelAndView renderNewVehicleForm()
	{
		
		Vehicle vehicle = new Vehicle();
		return new ModelAndView("newVehicle","form",vehicle);

	} 
	
	@RequestMapping(value="/list.html", method=RequestMethod.GET)	
	public ModelAndView vehicles()
	{
		return new ModelAndView("allVehicles","vehicles",data.findAll());
	}
	  
	@RequestMapping(value="/vehicle/{name}")
	public ModelAndView showVehicleByName(@PathVariable("name") String name)
	{
		throw new UnsupportedOperationException();
	}
	
}
