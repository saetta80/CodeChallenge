package com.examples.RESTSpringTest.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.client.RestTemplate;

import com.examples.RESTSpringTest.Model.Country;
import com.examples.RESTSpringTest.Model.CountryList;

public class CountryServiceImpl extends CountryService{

	@Autowired
	RestTemplate restTemplate;
	
	
	@Override
	public List<Country> getById(String id) {
		// TODO Auto-generated method stub
		CountryList response = restTemplate.getForObject(
				  "http://api.worldbank.org/v2/country?format=json",
				  CountryList.class);
		
		List<Country> countries = response.getCountries();
		
		return countries;
	}

	
}
