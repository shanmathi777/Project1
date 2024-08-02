package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.beans.Countries;
import com.example.demo.services.CountryService;

@RestController
public class CountryControllers {
	
	@Autowired
	CountryService service;
	
	@GetMapping("/getcountries")
	public List   getCountries() {
		return service.getAllCountries();
	}
	
	
	@GetMapping("/getcountries/{id}")
	public Countries getCountriesById(@PathVariable  int id ) {
		return service.getCountrybyId(id);
	}
	
	@GetMapping("/getcountries/countryname")
	public Countries getCountriesByName(@RequestParam  String name) {
		return service.getCountrybyName(name);
	}
	
	@PostMapping("/addcountry")
	public Countries addCountry(@RequestBody Countries country) {
		return service.addCountry(country);
	}
	
	@PutMapping("/updatecountry")
	public Countries updateCountry(@RequestBody Countries country) {
		return service.addCountry(country);
	}
	
	@DeleteMapping("/deletecountry/{id}")
	public AddResponse deleteCountry(@PathVariable  int id) {
		return service.deleteCountry(id);
	}
		
	
}
