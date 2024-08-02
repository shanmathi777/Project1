package com.example.demo.services;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.beans.Countries;
import com.example.demo.controllers.AddResponse;

@Service
public class CountryService {
	
	static HashMap<Integer,Countries> countrymap;

	public CountryService() {
		countrymap = new HashMap<Integer,Countries>();
		Countries country1 = new Countries(1,"India","Delhi");
		Countries country2 = new Countries(2,"America","Washington");
		Countries country3 = new Countries(3,"Japan","Tokyo");
	
        countrymap.put(1, country1);
        countrymap.put(2, country2);
        countrymap.put(3, country3);
	
	}
	
	public List<Countries> getAllCountries() {
		List<Countries> countries = new ArrayList<Countries>(countrymap.values());
		return countries;
	}
	
	public Countries getCountrybyId(int id) {
	   Countries  country = countrymap.get(id);
		return country;
	}
	
	
	public Countries getCountrybyName(String name) {
		Countries country = null;
		for(int i:countrymap.keySet()) {
			
			if(countrymap.get(i).getName().equals(name)) {
				country = countrymap.get(i);
			}
		}
		
		return country;
	}
	
	public Countries addCountry(Countries country) {
		
		country.setId(getMaxId());
		countrymap.put(country.getId(),country);
		
		return country;
	}
	
	public static int getMaxId() {
		int max =0;
		for(int id:countrymap.keySet()) {
			if(max<=id) {
				max=id;
			}
		}
		return max+1;
	}
	
	public Countries updateCountry(Countries country) {
		
		if(country.getId()>0) {
			countrymap.put(country.getId(), country);
			
		}
		return country;
	}
	  
	
	public AddResponse deleteCountry(int id) {
		countrymap.remove(id);
		AddResponse res = new AddResponse();
		res.setMsg("The country is deleted...");
		res.setId(id);
		return res;
		
}
	
}

